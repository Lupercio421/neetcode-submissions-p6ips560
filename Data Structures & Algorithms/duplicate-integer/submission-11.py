class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        resultSet = set()

        for num in nums:
            if num not in resultSet:
                resultSet.add(num)
            else:
                return True
        return False
        