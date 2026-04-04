class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        l, r = 0, len(numbers) - 1

        # while left is less than right
        while (l < r):

        # initialze curr_sum = numbers[l] + numbers[r]
            curr_sum = numbers[l] + numbers[r]
        # if curr_sum < target
            if (curr_sum < target):
                l += 1
            # increment left pointer
            elif (curr_sum > target):
        # elif curr_sum > target
                r -= 1
            # decrement right pointer
            else:
                return [l+1, r+1]
        # else 
            #return numbers[l+1,r+1]
        return []
        