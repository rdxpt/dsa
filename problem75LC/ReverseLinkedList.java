package problem75LC;

import java.util.*;

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
