class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        ansDict = set()
        for num in nums:
            if num not in ansDict:
                ansDict.add(num)
            else:
                return True
        return False