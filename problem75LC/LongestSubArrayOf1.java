/**
 * L on ge st Su bA rr ay Of1
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

public class LongestSubArrayOf1 {
    public int longestSubArray(int[] nums){
        int maxLength = 0;
        int left = 0;
        int zeroes = 0;

        for(int right = 0; right<nums.length; right++){
            if(nums[right]==0)zeroes++;
            while(zeroes>1){
                if(nums[left]==0)zeroes--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left);
        }

        return maxLength;
    }
}

