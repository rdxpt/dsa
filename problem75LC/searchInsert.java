/**
 * s ea rc hI ns er t
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Binary-search on answer/index; maintain correct invariants for low/high.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Binary Search
 */
package problem75LC;

public class searchInsert {
    public int searchInsertMethod(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int value = nums[mid];
            if(value == target) return mid;
            else if(value < target) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
}
