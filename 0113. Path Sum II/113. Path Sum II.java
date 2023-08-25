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
    List<List<Integer>> l=new ArrayList<>();
    private void helper(TreeNode root,List<Integer> arr,int n){
        if(root==null)
            return;
        arr.add(root.val);
        n=n-root.val;
        if(root.left==null && root.right==null && n==0){
            l.add(arr);
            return;
        }
        List<Integer> arr1=new ArrayList(arr);
        helper(root.left,arr,n);
        helper(root.right,arr1,n);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> arr=new ArrayList<>();
        helper(root,arr,targetSum);
        return l;
    }
}
