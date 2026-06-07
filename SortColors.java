class SortColors {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int left = 0;  
        int right = len-1;
        int index = 0;
        while(left< right && index < len) {
            if(nums[left]==0) {
                left++;
                continue;
            }
            if(nums[right]==2) {
                right--;
                continue;
            }
            if(nums[right]==0) {
                nums[right] = nums[left];
                nums[left] = 0;
                continue;
            }
            if(nums[left]==2) {
                nums[left] = nums[right];
                nums[right] = 2;
                continue;
            }
            if(nums[index]==0 && left < index) {
                nums[index] = nums[left];
                nums[left] = 0;
                left++;
            }
            if(nums[index]==2 && index < right) {
                nums[index] = nums[right];
                nums[right] = 2;
                right--;
            }
            index++;
        }
    }
}
