/**
 * R ev er se Li nk ed Li st
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

import problem75LC.OddEvenLinekdList.ListNode;

public class ReverseLinkedList {
    public static ListNode reverseLinkedList(ListNode head){
        if(head==null)return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr.next!=null) {
            next=curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        head = curr;
        head.next = prev;
        return head;
    }
}

