/**
 * D et er mi ne if Tw oS tr in gs Ar eC lo se
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Use frequency maps / two pointers / stack depending on pattern constraints.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: String
 */
package problem75LC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DetermineifTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        HashMap<Character, Integer> h1 = new HashMap<>();
        for(char i: word1.toCharArray())h1.put(i, h1.getOrDefault(i, 0)+1);
        HashMap<Character, Integer> h2 = new HashMap<>();
        for(char i: word1.toCharArray())h2.put(i, h2.getOrDefault(i, 0)+1);
        
        if(!h1.keySet().equals(h2.keySet()))return false;

        List<Integer> values1 = new ArrayList<>(h1.values());
        List<Integer> values2 = new ArrayList<>(h2.values());

        Collections.sort(values1);
        Collections.sort(values2);

        return values1.equals(values2);   
    }
}

