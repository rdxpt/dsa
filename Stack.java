import java.util.EmptyStackException;

public class Stack<T> {
    private ListNode top;
    private int length;

    private class ListNode{
        private T data;
        private ListNode next;

        public ListNode(T data){
            this.data = data;
        }
    }

    public Stack(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void displayStack(){
        if(isEmpty())throw new EmptyStackException();
        ListNode temp = top;
        System.out.println("*****");
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("*****");
    }

    public void push(T data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public T pop(){
        if(isEmpty())throw new EmptyStackException();
        T temp = top.data;
        top = top.next;
        length--;
        return temp;
    }

    public T peek(){
        if(isEmpty())throw new EmptyStackException();
        return top.data;
    }

    public static void main(String[] args) {

    }
}
