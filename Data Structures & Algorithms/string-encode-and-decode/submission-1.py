class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""
        for s in strs:
            res += str(len(s)) + "#" + s
        return res

    def decode(self, s: str) -> List[str]:
        res, i = [], 0

        while i < len(s):
            j = i
            while s[j] != "#": #still at an integer char
                j += 1
            length = int(s[i:j]) #once we get to the # character, length of following string is from i : j
            i = j + 1 #j is at the delim, j+1 is the first char of the string
            j = i + length # the variable j is i + length, meaning j is now the entire string
            res.append(s[i:j])
            i = j # you can view j as the start of the new string, or similarly, the end of the current string
        return res
