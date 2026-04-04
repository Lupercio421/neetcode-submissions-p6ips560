class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        res = defaultdict(list) #mapping charCount to list of Anagrams

        for s in strs:
            count = [0] * 26 #count of a - z

            for c in s:
                count[ord(c) - ord("a")] += 1 #let a = 80, b = 81. or let a = 80-80, b = 81-80

            res[tuple(count)].append(s) #tuple are non-mutable
        
        return list(res.values())



