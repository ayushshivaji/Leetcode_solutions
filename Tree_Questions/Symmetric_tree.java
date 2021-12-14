/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return(sym(root.left,root.right));
    }
    public boolean sym(TreeNode p,TreeNode q){
        if(p==null&&q==null)
            return(true);
        if((p!=null&&q==null)||(p==null&q!=null))
            return(false);    
        if(p.val==q.val)
            return(sym(p.left,q.right)&&sym(p.right,q.left));
        return(false);
    }
}

//https://leetcode.com/problems/symmetric-tree/submissions/
