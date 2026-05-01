package problem75LC;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        /*
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int[] res = new int[k];
        int counter = 0;
        for(int i = buckets.length-1; i >= 0; i--){
            if(buckets[i] == null) continue;
            for(Integer num : buckets[i]){
                res[counter] = num;
                counter++;
                if(counter == k) return res;
            }
        }
        return res;
        */

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for(int n : map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] res = new int[k];
        int i = 0;
        while(i<k)res[i++] = heap.poll();
        return res;
    }
}
