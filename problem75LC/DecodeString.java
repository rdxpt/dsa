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

