class FindingTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        boolean [] check = new boolean[len+1];
        for(int i = 0;i<len;i++) {
            int val = nums[i];
            if (check[val]==false) {
                check[val] = true;
            } else {
                return val;
            }
        }
        return 0;
    }
}
