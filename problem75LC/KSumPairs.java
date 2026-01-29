/**
 * K Su mP ai rs
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Hashing
 */
package problem75LC;

import java.util.Arrays;

public class KSumPairs {
    public static int kSumPairs(int[] nums, int k){
        int counter = 0;
        Arrays.sort(nums);
        int n= nums.length;
        int i=0, j=n-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == k){
                counter++;
                i++; j--;
            } else if(sum<k){
                i++;
            } else if(sum>k){
                j--;
            }
        }
        return counter;
    }

}

