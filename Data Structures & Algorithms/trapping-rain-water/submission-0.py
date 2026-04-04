class Solution:
    def trap(self, height: List[int]) -> int:

        if not height:
            return 0

        left_height,right_height = 0, len(height)-1
        leftMax = height[left_height]
        rightMax = height[right_height]

        water = 0

        while left_height < right_height:

            if leftMax < rightMax:
                left_height += 1
                leftMax = max(leftMax, height[left_height])
                water += leftMax - height[left_height]
            else:
                right_height -= 1
                rightMax = max(rightMax, height[right_height])
                water += rightMax-height[right_height]
        
        return water
