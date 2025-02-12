import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;
    
    private static class Stack_Arr{
        private int topArr;
        private int[] arr;
        public Stack_Arr(int cap){
            topArr = -1;
            arr = new int[cap];
        }

        public boolean isEmpty(){
            return topArr == -1;
        }
        public boolean isFull(){
            return arr.length-1 == topArr;
        }
        public int size(){
            return topArr+1;
        }

        public void push(int data){
            if(isFull())throw new RuntimeException("Stack is full !!!");
            topArr++;
            arr[topArr]=data;
        }
        public void pop(){
            arr[topArr]=0;
            topArr--;
        }
        public void displayStack_Arr(){
            for(int i: arr)System.out.print(i+" ");
            System.out.println();
        }
    }

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
        Stack_Arr stack_Arr = new Stack_Arr(10);
        stack_Arr.push(10);
        stack_Arr.push(10);
        stack_Arr.push(10);
        stack_Arr.push(10);
        stack_Arr.displayStack_Arr();
        stack_Arr.pop();
        stack_Arr.displayStack_Arr();

    }
}
