class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int n = word1.length();
        int m = word2.length();

        int i = 0, j = 0;

        while (i < n || j < m) {
            if (i < n) {
                res.append(word1.charAt(i++));
            }
            if (j < m) {
                res.append(word2.charAt(j++));
            }
        }
        return res.toString();
    }
}