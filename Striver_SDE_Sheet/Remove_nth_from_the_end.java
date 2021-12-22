/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        if(len==1)
            return(null);
        int count=1;
        len=len-n;
        if(len==0)
            return(head.next);
        temp=head;
        System.out.println(len);
        while(count<len){
            count++;
            temp=temp.next;
            System.out.println(count);
        }
        temp.next=temp.next.next;
        return(head);
    }
}

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
