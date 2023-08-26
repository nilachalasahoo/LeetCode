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
    int max=0;
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        max=Math.max(l+r,max);
        return 1+Math.max(l,r);   
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
}
