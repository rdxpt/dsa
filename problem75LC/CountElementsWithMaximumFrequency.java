package problem75LC;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        Map<Integer, Integer> ht = new HashMap<>();
        for(int i : nums){
            ht.put(i, ht.getOrDefault(i, 0)+1);
        }
        Collection<Integer> arr = ht.values();
        int maxFreq = Collections.max(arr);
        for(int freq : arr){
            if(freq == maxFreq) count += freq;
        }
        return count;
    }
}
