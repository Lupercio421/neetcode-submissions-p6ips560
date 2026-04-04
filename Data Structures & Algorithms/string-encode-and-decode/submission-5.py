class Solution:

    def encode(self, strs: List[str]) -> str:
        resultString = ""
        for s in strs:
            resultString += str(len(s)) + "#" + s
        return resultString

    def decode(self, s: str) -> List[str]:
        # "5#Hello5#World"
        res = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != "#":
                j += 1
            length = int(s[i:j])
            actualWord = s[j+1 : j+1+length]
            res.append(actualWord)
            i = j + 1 + length
        return res
