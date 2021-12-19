/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head,slow=head;
        if(head==null||head.next==null||head.next.next==null)
            return(false);            
        while(fast!=null&&slow!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return(true);
        }
        return(false);
    }
}

//https://leetcode.com/problems/linked-list-cycle/submissions/
