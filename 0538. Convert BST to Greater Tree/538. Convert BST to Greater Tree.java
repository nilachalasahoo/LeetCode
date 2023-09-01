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
        int r=helper(root.right,x);
        if(r==0)
            root.val=root.val+x;
        else
            root.val=root.val+r;
        if(root.left==null)
            return root.val;
        return helper(root.left,root.val);
        
    }
    public TreeNode convertBST(TreeNode root) {
        helper(root,0);
        return root;
    }
}
