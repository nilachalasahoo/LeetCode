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
    private List<Integer> preOrder(TreeNode root,List<Integer> list){
        if(root==null)
            return list;
        list.add(root.val);
        list=preOrder(root.left,list);
        return preOrder(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        return preOrder(root,l);
    }
}
