public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    public class ListNode{
        int data;
        ListNode previous;
        ListNode next;

        public ListNode(int data){
            this.data = data;
        }    
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
   }
   public boolean isEmpty(){
    return length==0;
   }
   public int length(){
    return length;
   }

   public void displayDllFw(){
    if(isEmpty())return;
    ListNode temp = head;
    while(temp != null){
        System.out.print(temp.data+"-->");
        temp = temp.next;
    }
    System.out.print("null");
    System.out.println();
   }

   public void displayDllBw(){
    if(isEmpty())return;
    ListNode temp = tail;
    while(temp != null){
        System.out.print(temp.data+"<--");
        temp = temp.previous;
    }
    System.out.print("null");
    System.out.println();
   }

   public void insertLast(int Value){
    ListNode newNode = new ListNode(Value);
    if(isEmpty())head = newNode;
    else{ 
        tail.next = newNode;
        newNode.previous = tail;
    }
    tail = newNode;
    length++;
   }

   public void insertFirst(int Value){
    ListNode newNode = new ListNode(Value);
    if(isEmpty()){
        tail = newNode;
    }
    else{
        head.previous = newNode;
    }
    newNode.next = head;
    head = newNode;
    length++;
   }

   public void deleteLast(){
    if(isEmpty())return;
    if(head.next ==null){
        head = null;
        tail = null;
        return;
    }
    tail = tail.previous;
    if(tail!=null)tail.next = null;
   }

   public void deleteFirst(){
    if(isEmpty())return;
    if(head ==null){
        head = null;
        tail = null;
        return;
    }
    head = head.next;
    if(head!=null)head.previous = null;
   }

   public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.insertFirst(5);
    dll.insertFirst(11);
    dll.insertFirst(2);
    dll.insertFirst(54);
    dll.insertFirst(7);
    

    dll.displayDllBw();
    dll.displayDllFw();

    DoublyLinkedList dll2 = new DoublyLinkedList();
    dll2.insertLast(1);
    dll2.insertLast(2);
    dll2.insertLast(3);
    dll2.insertLast(4);
    dll2.insertLast(5);

    dll2.displayDllBw();
    dll2.displayDllFw();

    dll2.deleteLast();
    dll2.displayDllFw();
    dll2.deleteFirst();
    dll2.displayDllFw();
    dll2.deleteFirst();
    dll2.displayDllFw();
    dll2.deleteFirst();
    dll2.displayDllFw();
    dll2.deleteFirst();
    dll2.displayDllFw();
   }
}
