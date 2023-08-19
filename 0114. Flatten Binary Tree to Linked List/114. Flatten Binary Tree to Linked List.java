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
    private TreeNode helper(TreeNode head,TreeNode root){
        if(root==null)
            return head;
        head.right=root;
        TreeNode x=root.left;
        TreeNode y=root.right;
        head=head.right;
        head.left=null;
        if(x!=null)
            head=helper(head,x);
        if(y!=null)
            head=helper(head,y);
        return head;
    }
    public void flatten(TreeNode root) {
        TreeNode head=new TreeNode(0);
        root=helper(head,root);
        root=head.right;
    }
}
