class Solution {
    public int trap(int[] height) {
        int runningSum = 0;
        int l = 0;
        int r = height.length - 1;

        int leftMax = height[l];
        int rightMax = height[r];

        if (height == null || height.length == 0) { return 0;}

        //find the minimum of the max height to the left, and max height to the right : min(height[l], height[r]) - height[i]

        while (l < r) {
            if (leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                runningSum += leftMax - height[l];
            } else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                runningSum += rightMax - height[r];
            }
        }
        return runningSum;
    }
}
