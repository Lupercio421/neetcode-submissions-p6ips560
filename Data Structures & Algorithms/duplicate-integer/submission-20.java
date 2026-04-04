class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ansSet = new HashSet<>();
        for (int n:nums){
            if (ansSet.contains(n)){
                return true;
            }
            else
            {
                ansSet.add(n);
            }
        }
        return false;
    }
}