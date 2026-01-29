/**
 * R em ov in gS ta rs Fr om St ri ng
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

import java.util.Stack;

public class RemovingStarsFromString {
    public String removeStars(String s){
        Stack<Character> stack = new Stack<>();
        char[] text = s.toCharArray();
        for(char i : text){
            if(i=='*')stack.pop();
            else stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : stack) sb.append(c);
        return sb.toString();
    }
}

