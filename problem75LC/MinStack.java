/**
 * M in St ac k
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Use a stack to maintain a monotonic property or handle nested structure.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Stack
 */
package problem75LC;

public class MinStack {
    ListNode head;

    public MinStack() {
        head = null; 
    }
    
    public void push(int val) {
        ListNode curr = new ListNode(val);

        if(head == null) curr.min = val;
        else{
            if(val<head.min) curr.min = val;
            else curr.min = head.min;
        }
        curr.next = head;
        head = curr;
    }
    
    public void pop() {
        if(head!=null)head = head.next;
    }
    
    public int top() {
        return head!=null ? head.val : -1;
    }
    
    public int getMin() {
        return head.min;
    }
}

class ListNode{
    int val;
    int min;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}


