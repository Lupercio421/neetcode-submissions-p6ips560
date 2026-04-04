class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        count = {}

        freq = [[] for i in range(len(nums) + 1)]

        for n in nums:
            count[n] = count.get(n, 0) + 1
        
        for val,c in count.items():
            freq[c].append(val)

        resList = []

        for i in range(len(freq) - 1, 0, -1):
            for val in freq[i]:
                resList.append(val)
                if len(resList) == k:
                    return resList