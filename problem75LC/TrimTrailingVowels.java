package problem75LC;

import java.util.HashSet;
import java.util.Set;

public class TrimTrailingVowels {
    public String trimTrailingVowels(String s) {
        int length = s.length();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        while(length>0 && vowels.contains(s.charAt(length-1))) length --;
        return s.substring(0, length);
    }
}
