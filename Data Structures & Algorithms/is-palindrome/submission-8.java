class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");
        cleanedString = cleanedString.toLowerCase();
        // cleanedString = cleanedString.replaceAll("[^\\w]", "");
        int l = 0;
        int r = cleanedString.length() - 1;

        while (l < r) {
            if (cleanedString.charAt(l) != cleanedString.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}
