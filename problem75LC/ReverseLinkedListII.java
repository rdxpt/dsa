/**
 * R ev er se Li nk ed Li st II
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

import java.util.List;
import java.util.ArrayList;

public class ReverseLinkedListII {
    // Using ArrayList - Dumb Bruteforce
    public ListNode reverseBetweenI(ListNode head, int left, int right) {
        if(head == null) return null;
        List<Integer> arr = new ArrayList<>();
        ListNode node = head;
        while(node != null){
            arr.add(node.val);
            node = node.next;
        }
        int l = left - 1;
        int r = right - 1;
        while(l<r){
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);
            l++; r--;
        }
        node = head;
        int index = 0;
        while(node != null){
            node.val = arr.get(index);
            node = node.next;
        }
        return head;
    }

    public ListNode reverseBetweenII(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=0; i < left - 1; i++) prev = prev.next;
        ListNode curr = prev.next;

        for(int i = 0; i < right - left; i++){
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev;
        }

        return dummy.next;
    }
}

