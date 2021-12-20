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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode same,temp=head;
        while(head!=null&&head.next!=null){
            same=head;
            while(same!=null&&head.val==same.val){
                same=same.next;
            }
            if(head==same)
            {head=head.next;continue;}
            head.next=same;
            head=head.next;
        }
        return(temp);
    }
}

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
