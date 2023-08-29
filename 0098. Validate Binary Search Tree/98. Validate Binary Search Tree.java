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
    public boolean check(TreeNode root,int max,int min){
        if(root==null)
            return true;
        if(root.val==Integer.MIN_VALUE ){
            if(min==root.val && root.left==null)
                return check(root.right,max,root.val+1);
            else
                return false;
        }
        if(root.val==Integer.MAX_VALUE){
            if(max==root.val && root.right==null)
                return check(root.left,root.val-1,min);
            else
                return false;
        }
        if(root.val>=min && root.val<=max){
            boolean a=check(root.left,root.val-1,min);
            boolean b=check(root.right,max,root.val+1);
            return a && b;
        }
        return false;
    }
    public boolean isValidBST(TreeNode root) {
        return check(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
}
