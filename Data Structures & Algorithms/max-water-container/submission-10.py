class Solution:
    def maxArea(self, height: List[int]) -> int:

        l,r = 0, len(height)-1
        water = 0

        while (l<r):
            width = r-l

            water = max(water, min(height[l],height[r]) * width)

            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return water

        