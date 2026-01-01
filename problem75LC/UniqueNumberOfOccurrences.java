package problem75LC;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i : arr) hash.put(i, hash.getOrDefault(i, 0)+1);

        Collection<Integer> occ = hash.values();
        Set<Integer> uniqueNumbers = new HashSet<>(occ);
    
        return occ.size()==uniqueNumbers.size();
    }
}
