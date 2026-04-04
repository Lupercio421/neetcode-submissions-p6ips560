class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        
        ansArr = []
        for i in range(2):
            for n in nums:
                ansArr.append(n)
        return ansArr