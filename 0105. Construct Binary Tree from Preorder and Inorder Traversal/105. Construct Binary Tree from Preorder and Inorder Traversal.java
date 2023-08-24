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
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] pre;
    int x=0;
    private TreeNode helper(int st,int end){
        if(st>end)
            return null;
        int n=pre[x];
        x++;
        int i=map.get(n);
        TreeNode root=new TreeNode(n);
        root.left=helper(st,i-1);
        root.right=helper(i+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre=preorder;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(0,inorder.length-1);
    }
}
