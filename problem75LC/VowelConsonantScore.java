/**
 * V ow el Co ns on an tS co re
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

public class VowelConsonantScore {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch <='z'){
                if(ch == 'a' || ch =='i' || ch == 'e' || ch == 'o' || ch == 'u') v++;
                else c++;
            }
        }

        return c == 0 ? 0 : v/c;
    }
}

