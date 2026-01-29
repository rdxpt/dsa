/**
 * V al id Pa ra nt he si sP ro bl em
 *
 * Purpose:
 * - DSA practice solution (revision notes at top).
 *
 * Key idea:
 * - Define a DP state + transition; decide memoization vs tabulation.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DP
 */
public class ValidParanthesisProblem {
    public static Boolean validParanthesis(String str){
        Stack_Arr<Character> stack = new Stack_Arr<>(100);
        for(Character c : str.toCharArray()){
            if(c=='(' || c=='{' || c=='[')stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if(
                    (c==')' && top =='(') ||
                    (c=='}' && top =='{') ||
                    (c==']' && top =='[')
                ){stack.pop();}
                else return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "{[]()[{}]";
        System.out.println(validParanthesis(str));
    }
}

