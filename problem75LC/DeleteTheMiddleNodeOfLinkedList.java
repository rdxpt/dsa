package problem75LC;

public class DeleteTheMiddleNodeOfLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteMiddleNode(ListNode head) {
        if(head.next==null){
            head = null;
            return head;
        }
        ListNode slowP = head;
        ListNode fastP = head;
        while(fastP.next.next!=null && fastP.next.next.next != null){
            fastP = fastP.next.next;
            slowP = slowP.next;
        }
        slowP.next = slowP.next.next;
        return head;
    }

}
