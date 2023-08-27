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
class CBTInserter {
    TreeNode root;
    Queue<TreeNode> q;
    public CBTInserter(TreeNode root) {
        this.root=root;
        q=new LinkedList<>();
        Queue<TreeNode> x=new LinkedList<>();
        x.add(root);
        while(!x.isEmpty()){
            root=x.poll();
            if(root.left==null || root.right==null)
                q.add(root);
            if(root.left!=null)
                x.add(root.left);
            if(root.right!=null)
                x.add(root.right);
        }
    }
    
    public int insert(int val) {
        TreeNode head=q.element();
        TreeNode child=new TreeNode(val);
        q.add(child);
        if(head.left==null){
            head.left=child;
        }else{
            head.right=child;
            q.poll();
        }
        return head.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */
