package problem75LC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class SubstringwithConcatenationofAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if(s == null || words == null || words.length == 0) return res;


        int sLen = s.length();
        int wordCount = words.length;
        int wordLen = words[0].length();
        int totalLen = wordCount*wordLen;

        //  1. Build Target Frequency Map
        Map<String, Integer> counts = new HashMap<>();
        for(String word : words)counts.put(word, counts.getOrDefault(word, 0) + 1);
        
        // 2. Run the sliding window wordLen times
        for(int i = 0; i < wordLen; i++){
            int left = i, right = i, count = 0;
            Map<String, Integer> currentMap  = new HashMap<>();

            while(right + wordLen <= sLen){
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if(counts.containsKey(word)){
                    currentMap.put(word, currentMap.getOrDefault(word, 0)+1);
                    count ++;
                    while(counts.containsKey(word)){
                        String leftWord = s.substring(left, left + wordLen);
                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
                        count --;
                        left += wordLen;
                    }

                    if(count == wordCount) res.add(left);
                    else {
                        currentMap.clear();;
                        count = 0;
                        left = right;
                    }
                }
            }
        }

        return res;
    }
}
