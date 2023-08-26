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
    private int helper(TreeNode root){
        if(root==null)
            return 0;
        int x=root.val;
        if(root.left==null && root.right==null){
            root.val=0;
            return x;
        }
        int l=helper(root.left);
        int r=helper(root.right);
        root.val=Math.abs(l-r);
        return l+r+x;
    }
    private int sum(TreeNode root){
        if(root==null)
            return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public int findTilt(TreeNode root) {
        helper(root);
        return sum(root);
    }
}
