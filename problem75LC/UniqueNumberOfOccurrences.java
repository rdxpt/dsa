/**
 * U ni qu eN um be rO fO cc ur re nc es
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

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i : arr) hash.put(i, hash.getOrDefault(i, 0)+1);

        Collection<Integer> occ = hash.values();
        Set<Integer> uniqueNumbers = new HashSet<>(occ);
    
        return occ.size()==uniqueNumbers.size();
    }
}

