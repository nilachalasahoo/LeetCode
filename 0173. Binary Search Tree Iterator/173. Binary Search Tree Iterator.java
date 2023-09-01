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
class BSTIterator {
    TreeNode root;
    public BSTIterator(TreeNode root) {
        this.root=root;
    }
    
    public int next() {
        if(root.left==null){
            int x=root.val;
            root=root.right;
            return x;
        }
        TreeNode head=root;
        while(head.left.left!=null){
            head=head.left;
        }
        int x=head.left.val;
        head.left=head.left.right;
        return x;
    }
    
    public boolean hasNext() {
        return root!=null;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
