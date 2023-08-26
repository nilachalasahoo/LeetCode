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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        if(root==null)
            return l;
        Queue<TreeNode> q=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            root=q.remove();
            if(root==null){
                l.add(max);
                max=Integer.MIN_VALUE;
                if(!q.isEmpty())
                    q.add(null);
                continue;
            }
            max=Math.max(root.val,max);
            if(root.left!=null)
                q.add(root.left);
            if(root.right!=null)
                q.add(root.right);
        }
        return l;
    }
}
