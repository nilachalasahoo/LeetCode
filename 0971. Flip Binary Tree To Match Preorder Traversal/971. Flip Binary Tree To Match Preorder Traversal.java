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
    List<Integer> l=new ArrayList<>();
    private boolean helper(TreeNode root,int[] arr){
        if(root==null)
            return true;
        if(root.val!=arr[i])
            return false;
        i++;
        if(root.left!=null && root.left.val!=arr[i]){
            l.add(root.val);
            return helper(root.right,arr)&& helper(root.left,arr);
        }
        return helper(root.left,arr)&& helper(root.right,arr);
    }
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        if(helper(root,voyage))
            return l;
        return Arrays.asList(-1);
    }
}
