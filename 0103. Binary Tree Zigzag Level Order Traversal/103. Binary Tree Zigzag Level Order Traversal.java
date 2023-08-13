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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> x=new ArrayList<>();
        int i=0;
        while(!q.isEmpty()){
            root=q.remove();
            if(root==null){
                if(i%2==0)
                    l.add(x);
                else{
                    Collections.reverse(x);
                    l.add(x);
                }
                i++;
                if(!q.isEmpty()){
                    x=new ArrayList<>();
                    q.add(null);
                }
                continue;
            }else{
                x.add(root.val);
            }
            if(root.left!=null)
                q.add(root.left);
            if(root.right!=null)
                q.add(root.right);
        }
        return l;
    }
}
