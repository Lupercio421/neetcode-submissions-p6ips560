class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int count = 0;

        for (int start = 0; count < n; start++) {
            // will be updated per iteration
            int current = start;
            int prev = nums[start];
            //

            do {
                int nextIdx = (current + k) % n;
                int temp = nums[nextIdx];
                nums[nextIdx] = prev; // first swap at k rotations
                prev = temp; // second swap at k rotations
                current = nextIdx;
                count++;
            } while (start != current);
        }
    }
}
/*
rotate 1 steps to the right: [8,1,2,3,4,5,6,7]
rotate 2 steps to the right: [7,8,1,2,3,4,5,6]
rotate 3 steps to the right: [6,7,8,1,2,3,4,5]
rotate 4 steps to the right: [5,6,7,8,1,2,3,4]
*/