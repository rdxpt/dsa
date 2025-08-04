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
