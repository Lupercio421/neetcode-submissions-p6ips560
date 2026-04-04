class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # this is the result array
        res = []

        # we can sort list
        nums.sort()

        for i, a in enumerate(nums):
            # check that this isn't the first value in input array
            # check that a is the same value as before, so we can skip it
            if i > 0 and a == nums[i-1]:
                continue

            #start of two sum implementation
            l,r = i+1, len(nums) - 1

            #l and r can't be equal
            while l < r:
                #take the sum
                threeSum = a + nums[l] + nums[r]
                if threeSum > 0:
                    r -= 1
                elif threeSum < 0:
                    l += 1
                else:
                    res.append([a, nums[l], nums[r]])
                    l+=1
                    #while the current nums[l] value is the same as the previous and it is still less than r
                    while nums[l] == nums[l-1] and l < r:
                        l+=1
        return res