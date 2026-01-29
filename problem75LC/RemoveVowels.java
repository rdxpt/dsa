/**
 * R em ov eV ow el s
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

import java.util.Set;

public class RemoveVowels {
    public static String removeVowels(String str){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder strbd = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(!vowels.contains(c))strbd.append(c);
        }
        return strbd.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeVowels("Hey how are you doing ?"));
    }
}

