package problem75LC;
import java.util.LinkedList;;
public class DesignHashset {
    
}

class MyHashSet{
    private final int BUCKET_SIZE = 769;
    private LinkedList<Integer>[] buckets;

    public MyHashSet(){
        buckets = new LinkedList[BUCKET_SIZE];
        for(int i = 0; i<BUCKET_SIZE; i++){
            buckets[i] = new LinkedList<>();
        }
    }
    private int hash(int key){
        return key%BUCKET_SIZE;
    }
    public void add(int key){
        int idx = hash(key);
        if(!buckets[idx].contains(key)){
            buckets[idx].add(key);
        }
    }
    public void remove(int key){
        int idx = hash(key);
        buckets[idx].remove(Integer.valueOf(idx));
    }
    public boolean contains(int key){
        int idx = hash(key);
        return buckets[idx].contains(key);
    }

}