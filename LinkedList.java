
public class LinkedList {

    private ListNode head;

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
        System.out.println();
    }

    public static int lengthsll(LinkedList sll){
        int len = 0;
        ListNode current = sll.head;
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
         public searchResult(boolean bool, int pos){
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

    public ListNode nthFromEnd1(int n){
        int len = 0;
        ListNode current = head;
        while(current!=null){
            current = current.next;
            len++;
        }
        current = head;
        for(int i = 0; i<len-n; i++)current = current.next;
        return current;
    }
    public ListNode nthFromEnd2(int n){
        if(head == null)return null;
        if(n<=0)throw new IllegalArgumentException("Invalid Value : "+n);
        ListNode main = head;
        ListNode ref = head;
        int count = 0;

        while(count<n){
            if(ref==null)throw new IllegalArgumentException(n+" is greater than number of elements in sll.");
            ref = ref.next;
            count++;
        }
        while(ref!=null){
            ref = ref.next;
            main = main.next;
        }
        return main;
    }

    public void remDupSorted(){
        if(head==null)return;
        ListNode current = head;
        while(current != null && current.next!= null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }

    public void insertInSortedsll(int data){
        ListNode newNode = new ListNode(data);
        if(head==null){
            head = newNode;
        }
        ListNode current = head;
        ListNode prev = null;
        while(current != null && current.data<newNode.data){
            prev = current;
            current = current.next;
        }
        prev.next = newNode;
        newNode.next = current;
    }

    public void deleteNode(int data){
        ListNode current = head;
        ListNode temp = null;
        if(current != null && current.data == data){
            head = current.next;
            return;
        }
        while(current != null && current.data !=data){
            temp = current;
            current = current.next;
        }
        if(current==null)throw new IllegalArgumentException("Not Found");
        temp.next = current.next;
    }

    public ListNode detectLoop(){
        if(head==null)throw new IllegalArgumentException("Empty sll");
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && slowPtr!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr)return pointOfLoop(slowPtr);
        }
        return null;
    }

    public ListNode pointOfLoop(ListNode slowptr){
        ListNode temp = head;
        while(slowptr.next != temp.next){
            slowptr = slowptr.next;
            temp = temp.next;
        }
        return removeLoop(slowptr, temp);
    }

    public ListNode removeLoop(ListNode slowptr, ListNode temp){
        slowptr.next = null;
        return temp.next;
    }

    public void createLoop(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public static LinkedList sortedMergeOf2SortedSlls(LinkedList sll1, LinkedList sll2){
        LinkedList sortedMergedSll = new LinkedList();
        ListNode p1 = sll1.head;
        ListNode p2 = sll2.head;
        while(p1 != null && p2 !=null){
            if(p1.data<=p2.data){
                sortedMergedSll.insertLast(p1.data);
                p1 = p1.next;
            }else{
                sortedMergedSll.insertLast(p2.data);
                p2 = p2.next;
            }
        }
        while(p1!=null){
            sortedMergedSll.insertLast(p1.data);
            p1 = p1.next;
        }
        while(p2!=null){
            sortedMergedSll.insertLast(p2.data);
            p2 = p2.next;
        }
        return sortedMergedSll;
    }

    public static void main(String[] args) {
        LinkedList sll1 = new LinkedList();
        sll1.insertFirst(7);
        sll1.insertFirst(4);
        sll1.insertFirst(1);
        
        displaysll(sll1);

        LinkedList sll2 = new LinkedList();
        sll2.insertFirst(8);
        sll2.insertFirst(5);
        sll2.insertFirst(2);
        
        displaysll(sll2);

        LinkedList smsll = sortedMergeOf2SortedSlls(sll1, sll2);
        displaysll(smsll);
    }
}
