import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
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

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty())throw new EmptyStackException();
        int temp = top.data;
        top = top.next;
        length--;
        return temp;
    }

    public int peek(){
        if(isEmpty())throw new EmptyStackException();
        return top.data;
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

    public static void main(String[] args) {

    }
}
