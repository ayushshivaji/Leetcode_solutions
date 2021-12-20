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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nlist = new ListNode();
        ListNode head=nlist;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<list2.val)
            {
                nlist.next=list1;
                list1=list1.next;
                nlist=nlist.next;
            }
            else
            {
                nlist.next=list2;
                list2=list2.next;
                nlist=nlist.next;
            }
        }
        while(list1!=null){
            nlist.next=list1;
            list1=list1.next;
            nlist=nlist.next;
        }
        while(list2!=null){
            nlist.next=list2;
            list2=list2.next;
            nlist=nlist.next;
        }
        return(head.next);
    }
}

//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
