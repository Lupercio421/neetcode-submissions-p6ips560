class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:

        ansArray = []

        for i in range(2):
            for num in nums:
                ansArray.append(num)
        return ansArray