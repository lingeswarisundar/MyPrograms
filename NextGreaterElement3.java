class NextGreaterElement3 {
    public int nextGreaterElement(int n) {
        int[] nums = new int[10];
        int len = 0;
        int num = n;
        int secondLarge = -1;
        int sortIndex = -1;
        int mid = Integer.MAX_VALUE;
        long output = 0;
        while(num > 0) {
            nums[len] = num%10;
            num = num/10;
            len++;
        }
        for(int i = 1;i < len;i++) {
            for(int j = i-1;j >=0;j--) {
                int large = nums[j];
                if(large > nums[i] && mid > large) {
                   secondLarge = j;
                    mid = large;
                    sortIndex = i-1;
                }
            }
            if(secondLarge!=-1) {
                int large= nums[secondLarge];
                nums[secondLarge] = nums[i];
                nums[i] = large;
                break;
            }
        }
        if(secondLarge!=-1) {
            for(int i = sortIndex;i >= 1;i--) {
                for(int j =i-1; j >= 0;j--) {
                    if(nums[i] >nums[j]) {
                        int small = nums[j];
                        nums[j] = nums[i];
                        nums[i] = small;
                    }
                }
            }
            for(int i = len-1;i>=0;i--) {
                output = output*10 + nums[i];
                System.out.println (nums[i]);  
            }
        if(output <= Integer.MAX_VALUE ) {
            return (int)output;
            
        }        
        }
        return -1;
    }
}
