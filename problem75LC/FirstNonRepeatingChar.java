/**
 * F ir st No nR ep ea ti ng Ch ar
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

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static int fnrc(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c : chars) map.put(c, map.getOrDefault(c,0)+1);
        for(int i=0; i<chars.length; i++){
            char c = chars[i];
            if(map.get(c)==1)return i;
        }
        return -1;
    }

    public static int firstNonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<chars.length; i++){
            char c = chars[i];
            if(map.get(c) == 1) return i;
        }
        return -1;
    }
}

