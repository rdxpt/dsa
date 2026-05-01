/**
 * Z er oF il le dS ub ar ra ys
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

public class ZeroFilledSubarrays {
    public static int zeroFilledSubarrays(int[] nums){
        long res = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                int count = 1;
                i++;
                while(i<nums.length && nums[i]==0){
                    count++;
                    i++;
                }
                res += (long) count*(count+1)/2;
            }
        }
        return (int) res;
    }
}

