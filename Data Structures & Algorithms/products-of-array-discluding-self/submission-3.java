class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++){
            /* 
            i = 2
            res[2] = res[2-1] * nums[2-1]
            res[2] = res[1] * nums[1]
            res[2] = 1 * 2
            res[2] = 2

            i = 3
            res[3] = res[2] * nums[2]
            res[3] = 2 * 3
            res[3] = 6

            i = 4
            res[4] = res[3] * nums[3]
            res[4] = 6*4
            res[4] = 24
            */
            res[i] = res[i-1] * nums[i-1];
        }

        int postfix = 1;
        for (int i = n - 1; i >=0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}  
