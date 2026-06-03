class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int count = 0;
        int len =  nums.length;
        if(len==0||len==1) {
            return len;
        }
        while(right < len) {
            if(nums[left]!=nums[right]) {
                left++;
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                count++;
            }
            right++;
        }
        return count+1;
    }
}
