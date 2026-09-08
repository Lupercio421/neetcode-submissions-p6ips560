public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break; //why? - because this signifies that after going through the values of the sorted sum, all numbers at nums[i + 1] , nums[i + 2] will be positive and NOT ZERO. So there is no way to get a sum of zero.
            if (i > 0 && nums[i] == nums[i - 1])
                continue; //this if condition is triggered when i > 0, not when i = 0. Thus, we are not nums[0] with nums[-1]

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++; //what purpose does this serve? Does this help avoid duplicated nums[l] values? - ensuring that after finding a valid triplet, the l pointer doesn't restart at the same value it just used.
                    }
                }
            }
        }
        return res;
    }
}