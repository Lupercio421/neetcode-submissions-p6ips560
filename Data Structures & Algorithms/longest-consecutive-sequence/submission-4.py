class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        numSet = set(nums)

        res = 0

        for n in nums:
            streak = 0
            curr = n
            while curr in numSet:
                streak += 1
                curr += 1
            res = max(streak, res)
            
        return res


        