package problem75LC;

import java.util.*;

public class Permutations{
    public static List<String> permuatations(String s){
        List<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        recurPermute(0, str, result);
        Collections.sort(result);
        return result;
    }

    public static void recurPermute(int index, StringBuilder s, List<String> result){
        if(index == s.length()){
            result.add(s.toString());
            return;
        }
        for(int i = index; i < s.length(); i++){
            swap(s, index, i);
            recurPermute(index + 1, s, result);
            swap(s, index, i);
        }
    }
    public static void swap(StringBuilder s, int i, int j){
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
    public static void main(String[] args) {
        System.out.println(permuatations("ABC").toString());
    }
}