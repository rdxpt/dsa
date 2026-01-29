/**
 * S or tL is tL in ke d
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Sort to enable greedy/two-pointers/dedup; be mindful of stable vs unstable needs.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Linked List, Sorting
 */
package problem75LC;

public class SortListLinked {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        return merge(left, right);
    }

    public ListNode getMiddle(ListNode node){
        ListNode slow = node;
        ListNode fast = node;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(Integer.MIN_VALUE);

        ListNode curr = dummy;

        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if(l1!=null) curr.next = l1;
        if(l2!=null) curr.next = l2;

        return dummy.next;
    }


}

