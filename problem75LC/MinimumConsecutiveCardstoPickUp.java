/**
 * M in im um Co ns ec ut iv eC ar ds to Pi ck Up
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

import java.util.Hashtable;
import java.util.Map;

public class MinimumConsecutiveCardstoPickUp {
    public int minimumCardPickup(int[] cards) {
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new Hashtable<>();
        for(int i=0; i<cards.length; i++){
            if(map.containsKey(cards[i])){
                int distance = i - map.get(cards[i]);
                min = Math.min(min, distance);
            }
            map.put(cards[i], i);
        }
        return min;
    }
}

