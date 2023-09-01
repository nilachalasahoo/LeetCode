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
    private TreeNode helper(int[] pre,int i,int n){
        if(i>n)
            return null;
        TreeNode root=new TreeNode(pre[i]);
        int x=i+1;
        while(x<=n){
            if(pre[x]<pre[i])
                x++;
            else
                break;
        }
        root.left=helper(pre,i+1,x-1);
        root.right=helper(pre,x,n);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,0,preorder.length-1);
    }
}
