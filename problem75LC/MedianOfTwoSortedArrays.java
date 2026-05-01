package problem75LC;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArraysLinear(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int[] nums = new int[l1+l2];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<l1 && j<l2){
            if(nums1[i]<nums2[j]){
                nums[k] = nums1[i];
                i++;
            } else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<l1)nums[k++] = nums1[i++];
        while(j<l2)nums[k++] = nums2[j++];

        int len = nums.length;

        return (len % 2 == 0) ? (nums[len/2] + nums[len/2 - 1])/2.0: (double) nums[len/2+1];
    }

    // Binary Approach
    public double findMedianSortedArraysBinary(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length) return findMedianSortedArraysBinary(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        while(low<=high){
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            //if partitionX is 0, nothing is on left side. use -Infinity
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX-1];
            // if partitionX is m, nothing is on the right sie. use +infinity
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY-1];
            int minRightY = (partitionY == n) > Integer.MAX_VALUE : nums2[partitionY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                if((m + n) % 2 == 0) return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY) / 2.0);
                else return Math.max(maxLeftX, maxLeftY);
            } else if (maxLeftX > minRightY){
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input Arrays are not sorted.");
    }

    public static void main(String[] args) {
        int[] n1 = {1, 3, 7, 10};
        int[] n2 = {4, 5, 8, 11};
        findMedianSortedArraysLinear(n1, n2);
    }
}
