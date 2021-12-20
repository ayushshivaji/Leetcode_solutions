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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<Integer>();
        return(preorder(root,lst));
    }
    public List<Integer> preorder(TreeNode root,List lst){
        if(root==null)
            return(new ArrayList<Integer>());
        lst.add(root.val);
        preorder(root.left,lst);
        preorder(root.right,lst);
        return(lst);
    }
}

//https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/
