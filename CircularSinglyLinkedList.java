import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        this.last = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void createCSLL(){
        ListNode first = new ListNode(1);
        first.next = first;

        last=first;
        length = 1;
    }

    public void displayCSLL(){
        if(last==null)return;
        ListNode first = last.next;
        do{
            System.out.print(first.data+"-->");
            first=first.next;
        }while(first!=last.next);
        System.out.print(" ... "+first.data+"  "+ length);
        System.out.println();
    }

    public void insertFirst(int value){
        ListNode temp = new ListNode(value);
        if(isEmpty()){
            temp.next = temp;
            last = temp;
        }else{
            temp.next = last.next;
            last.next = temp;
        }
        length++;
    }
    public void insertLast(int value){
        ListNode temp = new ListNode(value);
        if(isEmpty()){
            temp.next = temp;
            last = temp;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
    
        length++;
    }

    public ListNode deleteFirst(){
        if(isEmpty())throw new NoSuchElementException();
        ListNode temp = last.next;
        if(last.next == last)last=null;
        else last.next = temp.next;
        temp.next=null;
        length--;
        return temp;
    }
    public void deleteLast(){
        if(isEmpty())throw new NoSuchElementException();
        ListNode temp = last;
        if(last.next == last){
            last = null;
        }else{
            while(temp.next!=last)temp=temp.next;
        }
        temp.next = last.next;
        last = temp;
        length--;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.insertLast(17);
        csll.displayCSLL();

        csll.insertFirst(10);
        csll.displayCSLL();

        csll.insertLast(19);
        csll.displayCSLL();

        csll.deleteFirst();
        csll.displayCSLL();

    }
}
