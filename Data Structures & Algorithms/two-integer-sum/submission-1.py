class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ansList = List[int]
        ansMap = {}

        for i,n in enumerate(nums):
            difference = target - n
            if difference in ansMap:
                return [ansMap[difference], i]
            ansMap [n] = i
        return