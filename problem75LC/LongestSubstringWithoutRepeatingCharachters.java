package problem75LC;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharachters {
    public static int lswre(String str){
        int maxLength = 0;
        int i=0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            int length = 0;
            for(int j = i; j<arr.length; )
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
