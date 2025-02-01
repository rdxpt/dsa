public class LinkedList {

    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static void displaysll(LinkedList sll){
        ListNode current = sll.head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null" );
    }

    public static int lengthsll(LinkedList sll){
        int len = 0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            len++;
        }
        return len;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList sll = new LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
 
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));

        sll.insertFirst(21);

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));

        sll.insertFirst(42);

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));

        sll.insertFirst(25);

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));

        sll.insertLast(16);

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));
    }
}
