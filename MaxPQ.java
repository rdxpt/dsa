public class MaxPQ{
    Integer[] heap;
    int n;

    public MaxPQ(int capacity){
        heap = new Integer[capacity+1];
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
        for(int i = 0; i<heap.length;i++){
            heapN[i] = heap[i];
        }
        heap = heapN;
    }
    public void display(){
        if(isEmpty())return;
        for(int i=1; i<=n; i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

    public void insert(int x){
        if(isFull())resize(2*heap.length);
        n++;
        heap[n]=x;
        swim(n);
    }
    public void swim(int k){
        while(k>1 && heap[k]>heap[k/2]){
            int temp = heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }



    public static void main(String[] args) {
        MaxPQ pq = new MaxPQ(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        pq.display();

        pq.insert(5);
        pq.display();

        pq.insert(4);
        pq.display();

        pq.insert(3);
        pq.display();

        pq.insert(2);
        pq.display();

        pq.insert(1);
        pq.display();
    }



}