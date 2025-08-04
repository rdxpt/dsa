package problem75LC;

import java.util.Hashtable;
import java.util.Map;

public class MinimumConsecutiveCardstoPickUp {
    public int minimumCardPickup(int[] cards) {
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new Hashtable<>();
        for(int i=0; i<cards.length; i++){
            if(map.containsKey(cards[i])){
                int distance = i - map.get(cards[i]);
                min = Math.min(min, distance);
            }
            map.put(cards[i], i);
        }
        return min;
    }
}
