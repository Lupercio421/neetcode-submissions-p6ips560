class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ansArray = [0] * (2 * n)

        for i, num in enumerate(nums):
            ansArray[i] = ansArray[i + n] = num
        return ansArray