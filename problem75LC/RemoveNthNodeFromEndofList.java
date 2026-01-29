/**
 * R em ov eN th No de Fr om En do fL is t
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

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        ListNode curr = head;

        for(int i = 0; i < n; i++) tail = tail.next;
        if(tail == null) return head.next;
        while(tail.next != null){
            tail = tail.next;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}

