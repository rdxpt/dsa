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
