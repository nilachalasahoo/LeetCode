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
    private StringBuilder helper(TreeNode root){
        StringBuilder s=new StringBuilder();
        if(root==null)
            return s;
        s.append(root.val);
        if(root.left==null && root.right==null)
            return s;
        s.append('(');
        s.append(helper(root.left));
        s.append(')');
        if(root.right==null){
            return s;
        }
        s.append('(');
        s.append(helper(root.right));
        s.append(')');
        return s;
    }
    public String tree2str(TreeNode root) {
        return helper(root).toString();
    }
}
