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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> x=new ArrayList<>();
        while(!q.isEmpty()){
            root=q.remove();
            if(root==null){
                l.add(x);
                if(!q.isEmpty()){
                    x=new ArrayList<>();
                    q.add(null);
                }
                continue;
            }
            x.add(root.val);
            if(root.left!=null)
                q.add(root.left);
            if(root.right!=null)
                q.add(root.right);
        }
        Collections.reverse(l);
        return l;
    }
}
