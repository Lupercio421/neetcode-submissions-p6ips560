class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                seen[num - 1] = true;
            }
        }

        for (int i = 0; i < n; i++){
            if (!seen[i]) {
                return i + 1;
            }
        }
        //we have tried for all values within [1,n] inclusive, so it must be n + 1
        return n + 1;
    }
}