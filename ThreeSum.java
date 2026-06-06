class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int left = 1;
        int right = len - 1;
        for(int i = 0;i<len;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            left = i + 1;
            right = len - 1;
            while(left < right) {
                int total = nums[i] + nums[left] + nums[right];
                if(total==0) {
                    list.add(List.of(nums[i], nums[left], nums[right]));
                    int leftVal = nums[left];
                    int rightVal = nums[right];
                    while(left < right && leftVal == nums[left]) {
                        left++;
                    }
                    while(left < right && rightVal == nums[right]) {
                        right--;
                    }
                    
                } else if (total > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return list;
    }
}
