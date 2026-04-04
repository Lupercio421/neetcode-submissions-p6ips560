class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int water = 0;

        while (l < r){
            int width = r-l;
            water = Math.max(water, Math.min(height[l],height[r]) * width);

            if (height[l] <= height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return water;
    }
}