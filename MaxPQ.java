public class MaxPQ{

    Integer[] heap;
    Integer n;

    public MaxPQ(int capacity){
        heap = new Integer[capacity];
        n=0;
    }
    
    public boolean isEmpty(){
        return n==0;
    }
    public boolean isFull(){
        return n==heap.length-1;
    }
    public int size(){
        return n;
    }
    public void resize(int capacity){
        Integer[] heapN = new Integer[capacity];
        for(int i=0; i<=n; i++)heapN[i]=heap[i];
        heap = heapN;
    }
    public void display(){
        for(int i = 1; i<n; i++)System.out.print(heap[i]+" ");
        System.out.println();
    }
    public void swap(int j, int k){
        int temp = heap[j];
        heap[j] = heap[k];
        heap[k] = temp;
    }

    public void insert(int x){
        if(isFull())resize(2*heap.length);
        n++;
        heap[n]=x;
        swim(n);
    }
    public void swim(int k){
        while(k>1 && heap[k]>heap[k/2]){
            swap(k,k/2);
            k = k/2;
        }
    }

    public int deleteMax(){
        int max = heap[1];
        swap(1, n);
        n--;
        heap[n+1]=null;
        sink(1);
        return max;
    }
    public void sink(int k){
        while(2*k<n){
            int j = 2*k;
            if(j<n && heap[j]<heap[j+1])j++;
            if(heap[j]<heap[k])break;
            swap(j, k);
            k = j;
        }
    }

    public static void main(String[] args) {
        MaxPQ pq = new MaxPQ(3);

        pq.insert(10);
        pq.display();
        pq.insert(9);
        pq.display();
        pq.insert(8);
        pq.display();
        pq.insert(7);
        pq.display();
        pq.insert(6);
        pq.display();
        pq.insert(5);
        pq.display();
        pq.insert(120);
        pq.display();

        pq.deleteMax();
        pq.display();
    }
}
