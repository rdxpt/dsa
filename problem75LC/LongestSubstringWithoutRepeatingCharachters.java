/**
 * L on ge st Su bs tr in gW it ho ut Re pe at in gC ha ra ch te rs
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

public class LongestSubstringWithoutRepeatingCharachters {
    public static int lswre(String str){
        int maxLength = 0;
        int i=0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            int length = 0;
            for(int j = i; j<arr.length; )
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}

