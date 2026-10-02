class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;

        int n = word1.length();
        int m = word2.length();

        StringBuilder stringBuild = new StringBuilder();

        while (i < n || j < m){
            if (i < n){
                stringBuild.append(word1.charAt(i));
            }
            if (j < m){
                stringBuild.append(word2.charAt(j));
            }
            i++;
            j++;
        }
        return stringBuild.toString();
    }
}