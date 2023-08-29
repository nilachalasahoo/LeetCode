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
    int i=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return -1;
        int x=kthSmallest(root.left,k);
        if(x!=-1)
            return x;
        i++;
        if(i==k)
            return root.val;
        return kthSmallest(root.right,k);
    }
}
