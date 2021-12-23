/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0;ListNode headAA=headA,headBB=headB;
        while(headAA!=null)
        {
            l1++;
            headAA=headAA.next;
        }
        while(headBB!=null)
        {
            l2++;
            headBB=headBB.next;
        }
        int diff;ListNode temp,temp2;
        if(l2>=l1){
            diff=l2-l1;
            temp=headB;
            temp2=headA;
        }
        else{
            diff=l1-l2;
            temp=headA;
            temp2=headB;
        }
        while(diff-->0)
            temp=temp.next;
        while(temp!=null&&temp2!=null){
            if(temp==temp2)
                return(temp);
            temp=temp.next;
            temp2=temp2.next;
        }
        return(null);
        
    }
}

//https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/
