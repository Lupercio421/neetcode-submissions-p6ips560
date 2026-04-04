class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        
        i, n = 0, len(nums)
        print("initial n value: ", str(n))

        while i < n:
            if nums[i] == val:
                print("if nums[i] == val: " + str(nums[i]))
                n -= 1
                print("n: ", str(n))
                nums[i] = nums[n]
            else:
                print("nums[i]: " + str(nums[i]))
                i += 1
        return n
