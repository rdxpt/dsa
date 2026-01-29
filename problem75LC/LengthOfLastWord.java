/**
 * L en gt hO fL as tW or d
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

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;
        while(s.charAt(i)!=' ' && i>=0){
            count++;
            i--;
        }
        return count;
    }
}

