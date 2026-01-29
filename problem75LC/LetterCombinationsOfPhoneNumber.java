/**
 * L et te rC om bi na ti on sO fP ho ne Nu mb er
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

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();

        String[] mapping = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        List<String> res = new ArrayList<>();
        backtrack(res, digits, mapping, new StringBuilder(), 0);
        return res;
    }
    private void backtrack(List<String> res, String digits, String[] mapping, StringBuilder current, int index){
        if(index == digits.length()){
            
        }
    }
}

