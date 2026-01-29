/**
 * E qu al Ro wa nd Co lu mn Pa ir s
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

import java.util.Arrays;
import java.util.HashMap;

public class EqualRowandColumnPairs {
    public int equalPairs(int[][] grid) {
        int count = 0;
        HashMap<String, Integer> hash = new HashMap<>();
        for(int[] i: grid){
            String rowString = Arrays.toString(i);
            hash.put(rowString, hash.getOrDefault(rowString, 0)+1);
        }
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++){
            int[] arr = new int[m];
            for(int j=0; j<n; j++){
                arr[j] = grid[j][i];
            }
            String colString = Arrays.toString(arr);
            if(hash.containsKey(colString))count+=hash.get(colString);
        }

        return count;
    }
}

