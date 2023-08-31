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
    TreeNode tail=null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        TreeNode head=increasingBST(root.left);
        if(head==null){
            head=root;
            tail=root;
        }else{
            tail.right=root;
            tail=tail.right;
            tail.left=null;
        }
        tail.right=increasingBST(root.right);
        return head;
    }
}
