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
    private TreeNode helper(int[] nums,int st,int end){
        if(st>end)
            return null;
        int mid=st+(end-st)/2;
        TreeNode head=new TreeNode(nums[mid]);
        head.left=helper(nums,st,mid-1);
        head.right=helper(nums,mid+1,end);
        return head;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
}
