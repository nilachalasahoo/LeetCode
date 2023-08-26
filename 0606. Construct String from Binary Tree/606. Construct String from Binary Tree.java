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
    StringBuilder s;
    private void helper(TreeNode root){
        if(root==null)
            return;
        s.append(root.val);
        if(root.left==null && root.right==null)
            return;
        s.append('(');
        helper(root.left);
        s.append(')');
        if(root.right!=null){
            s.append('(');
            helper(root.right);
            s.append(')');
        }
    }
    public String tree2str(TreeNode root) {
        s=new StringBuilder();
        helper(root);
        return s.toString();
    }
}
