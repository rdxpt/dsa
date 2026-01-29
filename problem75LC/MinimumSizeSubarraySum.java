/**
 * M in im um Si ze Su ba rr ay Su m
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
 * Tags: Array
 */
package problem75LC;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int min_window_size = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for(int i=0; i<len; i++){
            sum += nums[i];
            
            while(sum >= target){
                min_window_size = Math.min(min_window_size, i-start+1);

                sum -= nums[start];
                start++;
            }
        }
        return min_window_size == Integer.MAX_VALUE ? 0 : min_window_size;
    }
}

