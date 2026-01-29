/**
 * M ax im um Av er ag eS ub ar ra yI
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

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k){
        double sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double maxAvg = sum/k;
        for(int i=k; i< nums.length-k; i++){
            sum = sum - nums[i-k] + nums[k];
            if(sum/k>maxAvg) maxAvg=sum/k;
        }
        return maxAvg;
    }
}

