class NextPermutation {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int rigth = len-2;
        int secondLarge = -1;
        int sortIndex = -1;
        int mid = 101;
        while(rigth >= 0){
            int left = rigth+1;
            while(left < len) {
                if(nums[rigth] < nums[left] && mid > nums[left]){
                    secondLarge = left;
                    mid = nums[left];  
                }
                left++;
            }
            if(secondLarge != -1){
                int large = nums[secondLarge];
                nums[secondLarge] = nums[rigth];
                nums[rigth] = large;
                sortIndex = rigth+1;
                break;
            }
            rigth--;
        }
        if(sortIndex==-1) {
            sortIndex = 0;
        }
        for (int i = sortIndex; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if(nums[i] > nums[j]) {
                    int small = nums[j];
                    nums[j] = nums[i];
                    nums[i] = small;
                }
            }
        }
    }
}
