class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #lets use a dictionary to store the key and the count of the key
        # create a majority element variable
        # for each key, if it's value is greater than the majority element, update the element

        ansMap = {}
        n = len(nums)

        for num in nums:
            ansMap[num] = 1 + ansMap.get(num, 0)

        for num, count in ansMap.items():
            if count > n // 2:
                return num            