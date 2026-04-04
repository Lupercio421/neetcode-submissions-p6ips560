class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        ansSet = set()

        for num in nums:
            if num in ansSet:
                return True
            else:
                ansSet.add(num)
        return False