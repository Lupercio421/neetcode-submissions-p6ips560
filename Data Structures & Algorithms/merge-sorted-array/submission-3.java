class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = Arrays.copyOf(nums1, m);
        int index = 0, i = 0, j = 0;

        while (index < m + n){
            if (j >= n || (i < m && nums1Copy[i] <= nums2[j])) {
                nums1[index++] = nums1Copy[i++];
            }
            else {
                nums1[index++] = nums2[j++];
            }
        }
    }
}