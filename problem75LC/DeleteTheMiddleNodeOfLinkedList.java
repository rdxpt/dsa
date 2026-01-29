/**
 * D el et eT he Mi dd le No de Of Li nk ed Li st
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Linked List
 */
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

