package problem75LC;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c))return false;
            map.put(c, map.get(c)-1);
            if(map.get(c)==0) map.remove(c);
        }
        return true;
    }
    public boolean canConstructArr(String ransomNote, String magazine){
        int[] counts = new int[26];
        for(char c: magazine.toCharArray())counts[c-'a']++;
        for(char c : ransomNote.toCharArray())if(--counts[c-'a']<0) return false;
        return true;
    }
}
