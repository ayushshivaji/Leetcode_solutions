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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<Integer>();
        postorder(root,lst);
        return(lst);
    }
    public List<Integer> postorder(TreeNode root,List lst){
        if(root==null)
            return(new ArrayList());
        postorder(root.left,lst);
        postorder(root.right,lst);
        lst.add(root.val);
        return(lst);
    }
}

//https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
