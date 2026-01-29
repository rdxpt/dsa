/**
 * D ec od eS tr in g
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

public class DecodeString {
    public static String decodeString(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int number = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                number=number*10+(c-'0');
            } else if(c=='['){
                countStack.push(number);
                resultStack.push(currentString);
                currentString = new StringBuilder();
                number=0;
            } else if(c==']'){
                int r = countStack.pop();
                StringBuilder temp = resultStack.pop();
                temp.append(currentString.toString().repeat(r));
                currentString=temp;

            } else {
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
}


