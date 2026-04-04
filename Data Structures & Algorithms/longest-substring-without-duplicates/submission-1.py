class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charSet = set() #make sure we have all the chars in the window
        l = 0
        res = 0
        for r in range(len(s)):
            #if we get a duplicate char, update the window and set
            while s[r] in charSet:
                charSet.remove(s[l])
                l += 1
            charSet.add(s[r])
            res = max(res, r - l + 1)
        return res