class Solution:
    # Remove in place
    # best to create a O(n) solution

    def removeElement(self, nums: List[int], val: int) -> int:

        tmp = []

        for num in nums:
            if num == val:
                continue
            else:
                print("num: " + str(num))
                tmp.append(num)

        for i in range(len(tmp)):
            print("len of tmp: " + str(len(tmp)))
            nums[i] = tmp[i]
        
        return len(tmp)
        