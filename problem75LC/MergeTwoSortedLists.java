/**
 * M er ge Tw oS or te dL is ts
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

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode itr = root;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                itr.next = list1;
                list1 = list1.next;
            } else {
                itr.next = list2;
                list2 = list2.next;
            }
            itr = itr.next;
        }
        if(list1 != null) itr.next = list1;
        else itr.next = list2;
        return root.next;
    }
}

