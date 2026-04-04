class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> ansMap = new HashMap<>();
        int n = nums.length; //division towards zero

        for (int num : nums){
            ansMap.put(num, ansMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : ansMap.entrySet()){
            if (entry.getValue() > n / 2){
                return entry.getKey();
            }
        }
        return -1;
    }
}