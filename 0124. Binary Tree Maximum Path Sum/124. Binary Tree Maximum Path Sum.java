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
    int max=Integer.MIN_VALUE;
    private int helper(TreeNode root){
        if(root==null)
            return 0;
        int l=helper(root.left);
        int r=helper(root.right);
        if(root.left!=null)
            max=Math.max(max,l);
        if(root.right!=null)
            max=Math.max(max,r);
        max=Math.max(max,root.val);
        if(l<0)
            l=0;
        if(r<0)
            r=0;
        max=Math.max(max,root.val+l+r);
        return root.val+Math.max(l,r);
        
    }
    public int maxPathSum(TreeNode root){
        helper(root);
        return max;
    }
}
