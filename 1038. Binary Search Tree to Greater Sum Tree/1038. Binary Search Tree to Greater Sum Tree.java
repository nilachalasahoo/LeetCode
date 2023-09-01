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
    private int helper(TreeNode root,int x){
        if(root==null)
            return 0;
        root.val=root.val+Math.max(x,helper(root.right,x));
        return Math.max(root.val,helper(root.left,root.val));
    }
    public TreeNode bstToGst(TreeNode root) {
        helper(root,0);
        return root;
    }
}
