/**
 * R ev er se No de sI nK Gr ou p
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
 * Tags: DSA
 */
package problem75LC;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while(true){
            ListNode kthNode = getK(groupPrev, k);
            if(kthNode == null){
                break;
            }

            ListNode groupNext = kthNode.next;
            ListNode prev = kthNode.next;
            ListNode curr = groupPrev.next;

            while(curr != groupNext){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode newGroup
        }
    }
    private ListNode getK(ListNode curr, int k){
        while(curr != null && k>0){
            curr = curr.next;
            k--;
        }
        return curr;
    }
}

