class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // target = a1 + nums[i]
            int a1 = target - nums[i];
            if (!map.containsKey(a1)) {
                map.put(nums[i], i); //put every num in nums into the hashmap
            } else {
                return new int[] {map.get(a1), i}; //if a1 is in the hashmap, map.get(a1) will return the index where this a1 was computed, and i is the current index of this iteration that together with map.get(a1), will sum to the target.
            }
        }
        return new int[] {};
    }
}
