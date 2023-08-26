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
    private Pair<Integer,Integer> helper(TreeNode root){
        if(root==null)
            return new Pair<>(null,0);
        if(root.left==null && root.right==null)
            return new Pair<>(root.val,1);
        Pair<Integer,Integer> l=helper(root.left);
        Pair<Integer,Integer> r=helper(root.right);
        if(l.getValue()>=r.getValue()){
            return new Pair<>(l.getKey(),l.getValue()+1);
        }
        return new Pair<>(r.getKey(),r.getValue()+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        return helper(root).getKey();
    }
}
