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
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth;
    }

    public void displayCSLL(){
        if(last==null)return;
        ListNode first = last.next;
        do{
            System.out.print(first.data+"-->");
            first=first.next;
        }while(first!=last.next);
        System.out.print(" ... "+first.data+"  "+ first.length());
        System.out.println();
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL();
        csll.displayCSLL();

    }
}
