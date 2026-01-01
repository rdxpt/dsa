package problem75LC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DetermineifTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        HashMap<Character, Integer> h1 = new HashMap<>();
        for(char i: word1.toCharArray())h1.put(i, h1.getOrDefault(i, 0)+1);
        HashMap<Character, Integer> h2 = new HashMap<>();
        for(char i: word1.toCharArray())h2.put(i, h2.getOrDefault(i, 0)+1);
        
        if(!h1.keySet().equals(h2.keySet()))return false;

        List<Integer> values1 = new ArrayList<>(h1.values());
        List<Integer> values2 = new ArrayList<>(h2.values());

        Collections.sort(values1);
        Collections.sort(values2);

        return values1.equals(values2);   
    }
}
