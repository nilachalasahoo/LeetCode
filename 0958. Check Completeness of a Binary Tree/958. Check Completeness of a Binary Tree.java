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
 import java.util.Queue;
 import java.util.LinkedList;
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)
            return true;
        boolean check=false;
        Queue<TreeNode> arr=new LinkedList<TreeNode>();
        arr.add(root);
        while(!arr.isEmpty()){
            root=arr.poll();
            if(root==null){
                check=true;
                continue;
            }
            if(check)
                return false;
            
            arr.add(root.left);
            arr.add(root.right);
        }
        return true;
    }
}
