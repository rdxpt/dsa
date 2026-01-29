/**
 * M in Ma xS um
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

import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
       // 1. MUST be long to hold the sum of large integers
        long sum = 0; 
        long min = arr.get(0);
        long max = arr.get(0);
        
        for(int i : arr){
            sum += i;
            if(i > max) max = i;
            if(i < min) min = i;
        }
        
        // 2. The math is now safe from overflow
        System.out.println((sum - max) + " " + (sum - min));
    }
}

