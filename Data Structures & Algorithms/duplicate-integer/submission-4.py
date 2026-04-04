class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        #initialize a hashmap
        #add values of the nums as the keys, and the values represent the count
        #if there is a key with value > 1, it is a duplicate, and return true

        keySet = set()
        hasDuplicate = False
        for num in nums:
            if num not in keySet:
                keySet.add(num)
            else:
                hasDuplicate = True
        return hasDuplicate
         