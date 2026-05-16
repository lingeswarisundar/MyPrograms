import java.util.HashMap;
class TwoSumLeetCode {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int left = 0;
        int right = nums.length-1;
        for(int i=0;i<nums.length;i++) {
            int other = target - nums[i];
            if(hm.containsKey(other)) {
                return new int[]{i,hm.get(other)};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
