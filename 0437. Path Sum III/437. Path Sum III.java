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
    private int helper(TreeNode root,long x){
        if(root==null)
            return 0;
        x=x-root.val;
        if(x==0)
            return 1+helper(root.left,x)+helper(root.right,x);
        return helper(root.left,x)+helper(root.right,x);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        return helper(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
}
