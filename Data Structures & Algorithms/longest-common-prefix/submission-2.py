class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        comparisonString = strs[0]

        for i in range(len(comparisonString)):
            for s in strs:
                if i == len(s) or s[i] != comparisonString[i]:
                    return comparisonString[:i]
        return comparisonString



