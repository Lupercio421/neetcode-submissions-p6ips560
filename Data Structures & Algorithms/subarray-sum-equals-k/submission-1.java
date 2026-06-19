class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int curSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);
        for (int i = 0; i < nums.length; i++){
            curSum += nums[i];
            int diff = curSum - k;
            res += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum,0) + 1);
        }
        return res;
    }
}