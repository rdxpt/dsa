/**
 * K id Wi th Gr ea te st Nu mb er Of Ca nd ie s
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
import java.util.ArrayList;

public class KidWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> res = new ArrayList<>();
        int n = candies.length;
        for(int i=0; i<n; i++){
            if(candies[i]>max)max=candies[i];
        }
        for(int i=0; i<n; i++){
            if(candies[i]+extraCandies>=max)res.add(true);
            else res.add(false);
        }
        return res;
    }
}

