class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int count = 0;

        for (int start = 0; count < n; start++) {
            // this assigned only at start and count = 0. The instructions inside do will update these variables for the remainder of the method
            int current = start;
            int prev = nums[start];
            //

            do { // the below will be computed as count++, and does not leave this section until the while condition is broken
                int nextIdx = (current + k) % n;
                int temp = nums[nextIdx];
                nums[nextIdx] = prev; // prev is defined before entering do, and re-assigned during every count++;
                prev = temp;
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

/*
1, 2, 3, 4, 5, 6, 7
*/
//