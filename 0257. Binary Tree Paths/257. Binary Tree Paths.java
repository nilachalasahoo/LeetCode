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
    private void helper(TreeNode root,StringBuilder s){
        if(root==null)
            return;
        int n=s.length();
        s.append("->");
        s.append(root.val);
        if(root.left==null && root.right==null){
            l.add(s.toString());
            s.setLength(n);
            return;
        }
        helper(root.left,s);
        helper(root.right,s);
        s.setLength(n);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder s=new StringBuilder();
        s.append(root.val);
        if(root.left==null && root.right==null){
            l.add(s.toString());
            return l;
        }
        helper(root.left,s);
        helper(root.right,s);
        return l;
    }
}
