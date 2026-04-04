class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        l = 0 #buying pointer
        r = 1 #selling pointer
        while r < len(prices): #keep it in bounds
            if prices[l] < prices[r]:
                maxP = max(maxP, prices[r] - prices[l])
            else:
                l = r #we found a new min, update to that index
            r += 1
        return maxP 
