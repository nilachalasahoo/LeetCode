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
    private TreeNode helper(TreeNode root,int val,int d,int i){
        if(root==null && d==1){
            return new TreeNode(val);
        }
        if(root==null)
            return root;
        if(d==1 && i==0){
            TreeNode head=new TreeNode(val);
            head.left=root;
            return head;
        }
        if(d==1 && i==1){
            TreeNode head=new TreeNode(val);
            head.right=root;
            return head;
        }
        root.left=helper(root.left,val,d-1,0);
        root.right=helper(root.right,val,d-1,1);
        return root;

    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return helper(root,val,depth,0);
    }
}
