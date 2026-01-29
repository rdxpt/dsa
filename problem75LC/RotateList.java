/**
 * R ot at eL is t
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

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode tail = head;
        int n = 1;
        while(tail.next != null){
            tail = tail.next;
            n++;
        }
        k = k % n;
        tail.next = head;
        for(int i = 0; i < n-k; i++) tail = tail.next;
        head = tail.next;
        tail.next = null;
        return head;
    }
}

