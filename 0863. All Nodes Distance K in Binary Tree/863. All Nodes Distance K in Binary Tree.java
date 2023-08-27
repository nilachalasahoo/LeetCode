/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> l=new ArrayList<>();
    private void find(TreeNode root,int n){
        if(root==null)
            return;
        if(n==0)
            l.add(root.val);
        find(root.left,n-1);
        find(root.right,n-1);
    }
    private int helper(TreeNode root,TreeNode t,int n){
        if(root==null)
            return -1;
        if(root==t){
            find(root,n);
            return n-1;
        }
        int x=helper(root.left,t,n);
        if(x>=0){
            if(x==0)
                l.add(root.val);
            find(root.right,x-1);
            return x-1;
        }
        x=helper(root.right,t,n);
        if(x>=0){
            if(x==0)
                l.add(root.val);
            find(root.left,x-1);
            return x-1;
        }
        return -1;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        helper(root,target,k);
        return l;
    }
}
