class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        
        trackingSet = set()

        for num in nums:
            if num in trackingSet:
                return num
            trackingSet.add(num)
        return -1

#Time Complexity: O(N)
#Space Complexity: O(N)