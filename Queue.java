import java.util.NoSuchElementException;

public class Queue<T> {
    private ListNode front;
    private ListNode rear;
    private int length;

    public class ListNode{
        private T data;
        private ListNode next;
        public ListNode(T data){
            this.data = data;
            this.next = null;
        }
    }

    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }
    public Boolean isEmpty(){
        return length == 0;
    }
    public void displayQ(){
        if(isEmpty())return;
        ListNode temp = front;
        System.out.print("front --> ");
        
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("rear");
        System.out.println();
    }

    public void enqueue(T data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    public T dequeue(){
        if(isEmpty())throw new NoSuchElementException();
        ListNode temp = front;
        front = front.next;
        if(front==null){
            rear = null;
        }
        length--;
        return temp.data;
    }


    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(10);
        q.displayQ();
        q.enqueue(11);
        q.displayQ();
        q.enqueue(12);
        q.displayQ();
        q.enqueue(13);
        q.displayQ();
        q.enqueue(14);
        q.displayQ();
        q.enqueue(15);
        q.displayQ();
        q.dequeue();
        q.displayQ();
        q.dequeue();
        q.displayQ();
    }
}
