package problem75LC;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(s==null || t==null || s.length()<t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int count = 0;

        while(right < s.length()){
            char r = s.charAt(right);
            

        }
    }
}
