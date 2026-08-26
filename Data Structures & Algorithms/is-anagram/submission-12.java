class Solution {
    public boolean isAnagram(String s, String t) {
        //have you checked if the length of string s and string t are the same?
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        
        // we have validated that the length of s and t are equal, so you can iterate over the length of s. 
        for (int i = 0; i < s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        //both countS and countT have entries for every distinct character and it's count
        // return a boolean check if both HashMap contents are equal
        return countS.equals(countT);
    }
}
