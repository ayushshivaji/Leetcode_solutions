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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        int count=1,len;
        if(head==null||k==0)
            return(head);
        while(tail.next!=null){
            count++;
            tail=tail.next;
        }
        len=count;
        tail.next=head;
        count=k%count;
        System.out.println(count);
        count=Math.abs(len-count);
        System.out.print(count);
        while(count>0)
        {
            count--;
            head=head.next;
            tail=tail.next;
        }
        tail.next=null;
        return(head);
    }
    // public int len(ListNode head){
    //     int count=
    //     while(head.next!=null){
    //         head=head.next;
    //         count++;
    //     }
    // }
}

//https://leetcode.com/problems/rotate-list/submissions/
