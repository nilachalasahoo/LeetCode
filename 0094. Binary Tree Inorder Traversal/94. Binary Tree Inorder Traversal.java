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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<Integer>();
        List<Integer> list=inorderTraversal(root.left);
        list.add(root.val);
        List<Integer> arr=inorderTraversal(root.right);
        for(int i=0;i<arr.size();i++)
            list.add(arr.get(i));
        return list;
    }
}
