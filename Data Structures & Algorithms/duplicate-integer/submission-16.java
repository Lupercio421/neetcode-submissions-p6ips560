class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ansSet = new HashSet<>();
        for (int num:nums){
            if (ansSet.contains(num)){
                return true;
            }
            else {
                ansSet.add(num);
            }
        }
        return false;
    }
}