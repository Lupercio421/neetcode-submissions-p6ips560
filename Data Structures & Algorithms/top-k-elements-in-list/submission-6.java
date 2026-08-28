class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums){
            frequency.merge(num, 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();

            if (buckets[count] == null){
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(num); //I am getting confused here. The translation from frequencies to buckets.
            // ...
            // bucket[1] = [3]
            // bucket[2] = [2]
            // bucket[3] = [1]
            // ...
        }
        int[] result = new int[k];
        int index = 0;

        for (int count = buckets.length - 1; count >= 0 && index < k; count--){
            if (buckets[count] == null){
                continue;
            }

            for (int num : buckets[count]){
                result[index++] = num;

                if (index == k){
                    return result;
                }
            }
        }
        return result;
    }
}
