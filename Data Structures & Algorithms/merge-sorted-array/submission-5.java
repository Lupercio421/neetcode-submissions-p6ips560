class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = Arrays.copyOf(nums1, m);
        int idx = 0, i = 0, j = 0;

        while (idx < m + n){ //m + n is the count of valid elements
            //why is `j >= n` needed? 
            // It helps to not read pas the end of nums2
            //How do we help compare if an element of nums2 is greater than the element of nums1Copy at i
            //nums1Copy element at i already being compared to nums2 element at j
            if (j >= n || (i < m && nums1Copy[i] <= nums2[j])){
                nums1[idx++] = nums1Copy[i++];
            } else {
                nums1[idx++] = nums2[j++];
            }
        }
    }
}