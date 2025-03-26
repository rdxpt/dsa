package problem75LC;
import java.util.*;

import problem75LC.OddEvenLinekdList.ListNode;

public class MaximumTwinSum {
    public int pairsum(ListNode head){
        if(head==null || head.next==null)return 0;
        ListNode fast=head, slow=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; fast=fast.next.next;
        }
        ListNode prev = null, curr=slow, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode fH = head;
        ListNode sH = prev;
        int max = 0;

        while(sH!=null){
            max=Math.max(max, fH.val+sH.val);
            fH=fH.next;
            sH=sH.next;
        }
        return max;
    }
}
