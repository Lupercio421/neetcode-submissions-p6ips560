class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:

        l = 0
        n = len(nums)

        while l < n:
            print("nums[l]: " + str(nums[l]))
            if nums[l] == val:
                n -= 1
                nums[l] = nums[n]
                continue
            else:
                l += 1
        return n
        