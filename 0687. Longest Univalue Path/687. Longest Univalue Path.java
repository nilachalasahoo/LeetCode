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
    private int helper(TreeNode root,int x){
        if(root==null || x!=root.val)
            return 0;
        else
            return 1+Math.max(helper(root.left,x),helper(root.right,x));
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null)
            return 0;
        max=Math.max(max,helper(root.right,root.val)+helper(root.left,root.val));
        longestUnivaluePath(root.left);
        longestUnivaluePath(root.right);
        return max;
    }
}
