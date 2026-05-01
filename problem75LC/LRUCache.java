package problem75LC;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node{
        int key, int value;
        Node prev, next;
        Node(int k, int v){
            this.key = k;
            this.value = v;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();

        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insertAtHead(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
            map.remove(key);
        }
        if(capacity==map.size()){
            map.remove(tail.prev.key);
            remove(tail.prev);
        }
        Node newNode = new Node(key, value);
        map.put(key, newNode);
        insertAtHead(newNode);
    }

    private void insertAtHead(Node node){
        node.next = head.next;
        head.next = node;
        node.prev = head;
        node.next.prev = node;
    }
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
