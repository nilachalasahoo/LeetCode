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
    List<String> l=new ArrayList<>();
    private void helper(TreeNode root,String s){
        if(root==null)
            return;
        s=s+"->"+root.val;
        if(root.left==null && root.right==null){
            l.add(s);
            return;
        }
        helper(root.left,s);
        helper(root.right,s);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root.left==null && root.right==null){
            l.add(""+root.val);
            return l;
        }
        helper(root.left,""+root.val);
        helper(root.right,""+root.val);
        return l;
    }
}
