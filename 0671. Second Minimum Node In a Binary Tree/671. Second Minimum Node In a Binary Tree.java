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
    int x=-1;
    private void helper(TreeNode root,int min){
        if(root==null)
            return;
        if(root.val<min){
            x=min;
            min=root.val;
        }else if((x==-1||x>root.val) && root.val!=min){
            x=root.val;
        }
        helper(root.left,min);
        helper(root.right,min);
    }
    public int findSecondMinimumValue(TreeNode root) {
        helper(root,root.val);
        return x;
    }
}
