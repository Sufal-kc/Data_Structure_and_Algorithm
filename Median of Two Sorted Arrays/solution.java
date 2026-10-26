// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int x = nums1.length + nums2.length;
        int[] nums3 = new int[x];
        double median;

        // Merge both sorted arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from nums1
        while (i < nums1.length) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements from nums2
        while (j < nums2.length) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }

        // Calculate median
        if (x % 2 == 0) {
            median = ((double) nums3[x / 2 - 1] + nums3[x / 2]) / 2.0;
        } else {
            median = nums3[x / 2];
        }

        return median;
    }
}
public class solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = s.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}