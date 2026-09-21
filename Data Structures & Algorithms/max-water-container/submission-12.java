class Solution {
    public int maxArea(int[] heights) {
        //is it worth keeping track of the distance between the indices?

        //with example height = [1,7,2,5,4,7,3,6], why don't we stop and return the answer at index 1, and index 5? We have to keep track of this with a variable

        //if we use two pointers, with one at index 0, one at index heights.length - 1, what condition would make them equal each other?

        int l = 0;
        int r = heights.length - 1;
        int runningMax = 0;

        while (l < r){
            int width = r - l;
            int area = width * Math.min(heights[l], heights[r]);
            runningMax = Math.max(runningMax, area);
            if (heights[l] < heights[r]) { //if the current value of heights[l] is less than heights[r] - increment l
                l++;
            } else {
                r--;
            }
        }
        return runningMax;
    }
}