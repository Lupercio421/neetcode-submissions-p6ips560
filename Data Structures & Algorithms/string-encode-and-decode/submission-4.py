class Solution:

    def encode(self, strs: List[str]) -> str:

        resultString = ""
        for s in strs:
            resultString += str(len(s)) + "#" + s
        return resultString

    def decode(self, s: str) -> List[str]:

        res, i = [], 0

        j = 1
        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            length = int(s[i:j])
            res.append(s[j + 1 : j + 1 + length])
            i = j + 1 + length
        return res

