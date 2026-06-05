class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int left = 0;
        int right = 0;
        int len = nums.length;
        if(len==1&&nums[0]==val) {
            return 0;
        }
        if(len<=1) {
            return len;
        }
        while(right < len) {
            if(nums[right]!=val) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                count++;
            }
            right++;
        }
        return count;
    }
}
