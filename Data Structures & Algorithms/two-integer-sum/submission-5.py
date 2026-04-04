class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        #nums[j] = target - nums[i]
        ansMap = {}

        for i,n in enumerate(nums):
            diff = target - n

            if diff in ansMap:
                return [ansMap[diff], i]
            ansMap[n] = i
        return