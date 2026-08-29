class Solution {
    public boolean isPalindrome(String s) {
        // String trimmedString = s.trim();
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");
        cleanedString = cleanedString.toLowerCase();
        int R = cleanedString.length() - 1;
        int L = 0;
        while (L < R){
            if (cleanedString.charAt(L) != cleanedString.charAt(R)){
                return false;
            }
            L++;
            R--;
        }
        return true;
    }
}
