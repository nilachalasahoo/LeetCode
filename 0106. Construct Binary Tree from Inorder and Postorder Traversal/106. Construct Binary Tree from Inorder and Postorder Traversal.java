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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        if(n==0)
            return null;
        if(n==1)
            return new TreeNode(postorder[0]);
        TreeNode head=new TreeNode(postorder[n-1]);
        int i=0;
        for(i=0;i<n;i++){
            if(postorder[n-1]==inorder[i])
                break;
        }
        int arr1[]=new int[i];
        int arr2[]=new int[i];
        for(int j=0;j<i;j++){
            arr1[j]=inorder[j];
            arr2[j]=postorder[j];
        }
        TreeNode left=buildTree(arr1,arr2);

        arr1=new int[n-1-i];
        arr2=new int[n-1-i];
        for(int j=0;j<(n-i-1);j++){
            arr1[j]=inorder[j+i+1];
            arr2[j]=postorder[j+i];
        }
        TreeNode right=buildTree(arr1,arr2);

        head.left=left;
        head.right=right;
        return head;
    }
}
