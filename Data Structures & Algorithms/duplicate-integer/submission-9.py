class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        ansDict = set()
        for num in nums:
            if num in ansDict:
                return True
            ansDict.add(num)
        return False