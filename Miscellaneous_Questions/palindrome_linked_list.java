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
    public boolean isPalindrome(ListNode head) {
        String pal = "";
        while(head!=null){
            pal+=String.valueOf(head.val);
            head=head.next;
        }
        // System.out.println(pal);
        int i=0,j=pal.length()-1;
        while(i<=j){
            if(pal.charAt(i)!=pal.charAt(j))
                return(false);
            i++;
            j--;
        }
        return(true);
    }
}

//https://leetcode.com/problems/palindrome-linked-list/submissions/
