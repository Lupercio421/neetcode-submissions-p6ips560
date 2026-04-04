class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        l,r = 0,len(numbers) - 1

        while l < r:
            curSum = numbers[l] + numbers[r]

        #if l + r > target, decrement the right index

            if curSum > target:
                r -= 1

        # if l + r < target, increment the left index
            elif curSum < target:
                l += 1

            else:
                return [l+1, r+1]
        return []