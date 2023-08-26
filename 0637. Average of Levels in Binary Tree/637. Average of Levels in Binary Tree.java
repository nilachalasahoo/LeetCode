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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> l=new ArrayList<>();
        q.add(root);
        q.add(null);
        double s=0;
        int n=0;
        while(!q.isEmpty()){
            root=q.remove();
            if(root==null){
                l.add(s/n);
                s=0;
                n=0;
                if(!q.isEmpty())
                    q.add(null);
                continue;
            }
            s=s+root.val;
            n++;
            if(root.left!=null)
                q.add(root.left);
            if(root.right!=null)
                q.add(root.right);
        }
        return l;
    }
}
