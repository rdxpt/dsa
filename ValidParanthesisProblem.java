public class ValidParanthesisProblem {
    public static Boolean validParanthesis(String str){
        Stack_Arr<Character> stack = new Stack_Arr<>(100);
        for(Character c : str.toCharArray()){
            if(c=='(' || c=='{' || c=='[')stack.push(c);
            else{
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
