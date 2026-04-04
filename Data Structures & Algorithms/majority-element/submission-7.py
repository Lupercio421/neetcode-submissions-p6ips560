class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        ansMap = {}

        n = len(nums) // 2

        for num in nums:
            ansMap[num] = 1 + ansMap.get(num, 0)

        for num, count in ansMap.items():
            if count > n:
                return num