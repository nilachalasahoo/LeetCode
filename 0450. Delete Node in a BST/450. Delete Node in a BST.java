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
    private TreeNode helper(TreeNode root1,TreeNode root2){
        if(root1.right==null){
            root1.right=root2;
            return root1;
        }
        helper(root1.right,root2);
        return root1;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return root;
        if(root.val==key){
            if(root.left==null && root.right==null)
                return null;
            if(root.left==null)
                return root.right;
            else
                return helper(root.left,root.right);
        }
        root.left=deleteNode(root.left,key);
        root.right=deleteNode(root.right,key);
        return root;
    }
}
