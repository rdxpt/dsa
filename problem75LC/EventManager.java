package problem75LC;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public class EventManager{
    PriorityQueue<int[]> q;
    Map<Integer, Integer> map;
    public EventManager(int[][] events) {
        map = new HashMap<>();
        q = new PriorityQueue<>(
            (a,b) -> {
                if(a[1] == b[1]) return Integer.compare(a[0], b[0]);
                return Integer.compare(b[1], a[1]);
            }
        );

        for(int[] event : events){
            q.add(event);
            map.put(event[0], event[1]);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId, newPriority);
        q.add(new int[] {eventId, newPriority});
    }
    
    public int pollHighest() {
        while(!q.isEmpty()){
            int[] event = q.poll();
            if(map.containsKey(event[0]) && map.get(event[0]) == event[1]){
                map.remove(event[0]);
                return event[0];
            }
        }
        return -1;
    }
}