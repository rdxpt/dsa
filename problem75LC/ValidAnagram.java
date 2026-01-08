package problem75LC;

import java.util.Map;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                int val = map.get(c);
                if(val != 0) map.put(c, val - 1);
                else return false;
            } else return false;
        }
        return true;
    }
}
