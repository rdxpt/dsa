import java.util.List;

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

    public void insertAnywhere(int value, int position){
        
        ListNode newNode = new ListNode(value);

        if(position==1){
            newNode.next = head;
            head = newNode;
        }
        ListNode current = head;
        for(int i = position-2; i>0; i--){
            current = current.next;
        }
        ListNode temp = current.next;
        current.next = newNode;
        newNode.next =  temp;
    }

    public void deleteFirst(){
        head = head.next;
    }
    
    public void deleteLast(){
        if(head==null || head.next == null)return;
        ListNode current = head;
        while(current.next.next != null)current = current.next;
        current.next = null;
    }

    public void deleteByPos(int pos){
        if(pos == 1) head = head.next;
        ListNode current = head;
        for(int i = pos-2; i>0; i--)current = current.next;
        current.next = current.next.next;
    }
    public void deleteByVal(int val){
        ListNode current = head;
        while(current.next.data != val)current = current.next;
        current.next = current.next.next;
    }

    class searchResult{
        boolean bool;
        int pos;
         public searchResult(boolean bool, int value){
            this.bool = bool;
            this.pos = pos;      
         }
    }

    public searchResult search(int val){
        int pos = 1;
        searchResult res = new searchResult(false, pos);
        ListNode current = head;
        do{
            if(current.data == val){
                res.bool = true;
                res.pos = pos;
                return res;
            }
            pos++;
            current = current.next;
        }while(current.next != null);
        return res;
    }

    public LinkedList  reverseSll(){
        LinkedList rsll = new LinkedList();

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while(current.next != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        rsll.head = current;
        rsll.head.next = prev;
        return rsll;
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

        sll.insertAnywhere(25, 3);

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));

        sll.insertAnywhere(4, 1);

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));
        
        sll.deleteFirst();

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));

        
        sll.deleteLast();

        displaysll(sll);
        System.out.println();
        System.out.println(lengthsll(sll));

        searchResult res = sll.search(22);
        System.out.println(res.bool+ ", "+ res.pos);

        displaysll(sll.reverseSll());
        
    }
}
