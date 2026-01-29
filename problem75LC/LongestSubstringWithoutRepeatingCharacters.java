/**
 * L on ge st Su bs tr in gW it ho ut Re pe at in gC ha ra ct er s
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Use recursion (DFS) or iterative traversal; watch for null/base cases.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Tree, String
 */
package problem75LC;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>(); 

        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, i);
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}

