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
    private boolean helper(TreeNode root,TreeNode sub){
        if(root==null && sub==null)
            return true;
        if(root==null || sub==null)
            return false;
        if(root.val!=sub.val)
            return false;
        return helper(root.left,sub.left)&&helper(root.right,sub.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
            return false;
        if(root.val==subRoot.val)
            return isSubtree(root.left,subRoot)||helper(root,subRoot)||isSubtree(root.right,subRoot);
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}
