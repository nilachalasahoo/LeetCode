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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode head=new TreeNode(val);
            head.left=root;
            return head;
        }
        int x=2;
        Queue<TreeNode> q1=new LinkedList<>();
        TreeNode head=root;
        q1.add(root);
        q1.add(null);
        while(!q1.isEmpty()){
            if(x==depth){
                root=q1.remove();
                if(root==null)
                    break;
                TreeNode l=root.left;
                TreeNode r=root.right;  
                root.left=new TreeNode(val); 
                root.right=new TreeNode(val);
                root.left.left=l;
                root.right.right=r;                 
            }else{
                root=q1.remove();
                if(root==null){
                    q1.add(null);
                    x++;
                    continue;
                }
                if(root.left!=null)
                    q1.add(root.left);
                if(root.right!=null)
                    q1.add(root.right);
            }
        }
        return head;
    }
}
