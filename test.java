public class test{
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public test(){
        this(10);
    }
    public test(int capacity){
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value){
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

    public void put(Integer key, String value){
        if(key==null || value==null) throw new IllegalArgumentException();
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
    private int getBucketIndex(Integer key){
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
            return head.value;
        }
        while(head.next!=null){
            if(head.next.key.equals(key)){
                String value = head.next.value;
                head.next = head.next.next;
                return value;
            }
            head = head.next;
        }
        return null;
    }
}