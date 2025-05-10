public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    private class HashNode {
        private Integer key;
        @SuppressWarnings("unused")
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<numOfBuckets; i++){

        }
        return null;
    }
    
    public void put(Integer key, String value){
        if(key==null || value==null){
            throw new IllegalArgumentException("Key or value cannot be null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
    }
    private int getBucketIndex(Integer key) {
        return key%numOfBuckets;
    }

    public String get(Integer key){
        if(key == null) throw new IllegalArgumentException();
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key))return head.value;
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key){
        if(key == null) throw new IllegalArgumentException();

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        if(head==null) return null;

        if(head.key.equals(key)){
            buckets[bucketIndex] = head.next;
            size--;
            return head.value;
        }
        while(head.next!=null){
            if(head.next.key.equals(key)){
                String value = head.next.value;
                head.next = head.next.next;
                size--;
                return value;
            }
            head = head.next;
        }
        return null;
    }


    public static void main(String[] args) {
        
    }
}