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
    HashMap<Integer,Boolean> map=new HashMap<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
            return false;
        if(map.containsKey(root.val))
            return true;
        else
            map.put(k-root.val,true);
        return findTarget(root.left,k)||findTarget(root.right,k);
    }
}
