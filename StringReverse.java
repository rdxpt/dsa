/**
 * S tr in gR ev er se
 *
 * Purpose:
 * - DSA practice solution (revision notes at top).
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
public class StringReverse {
    public static String reverse(String str){
        Stack_Arr<Character> stack = new Stack_Arr<>(str.length());
        char[] chars = str.toCharArray();
        for(char c: chars){
            stack.push(c);
        }
        for(int i=0; i<str.length(); i++){
            chars[i]=stack.pop();
        }
        return new String(chars);
        
    }
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(str);
        System.out.println(reverse(str));
    }
}

