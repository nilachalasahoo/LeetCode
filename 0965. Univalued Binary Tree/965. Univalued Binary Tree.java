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
    private boolean helper(TreeNode root,int x){
        if(root==null)
            return true;
        if(root.val!=x)
            return false;
        return helper(root.left,x)&&helper(root.right,x);
    }
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.val);
    }
}
