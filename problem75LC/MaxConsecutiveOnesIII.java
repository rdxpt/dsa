/**
 * M ax Co ns ec ut iv eO ne sI II
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
 * Tags: DSA
 */
package problem75LC;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k){
        int maxLen = 0, left = 0, zerosCount = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right]==0){
                zerosCount++;
            }
            while(zerosCount>k){
                if(nums[left]==0) zerosCount--;
                left++;
            }
            maxLen = Math.max(maxLen, left-right+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        
    }
}

