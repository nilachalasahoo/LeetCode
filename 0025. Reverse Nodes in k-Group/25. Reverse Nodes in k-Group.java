/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode x=head;
        head=reverse(head.next);
        x.next.next=x;
        x.next=null;
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)
            return head;
        ListNode root=head;
        for(int i=1;i<k;i++){
            if(root==null)
                return head;
            root=root.next;
        }
        if(root==null)
            return head;
        ListNode temp=root.next;
        root.next=null;
        root=reverse(head);
        head.next=reverseKGroup(temp,k);
        return root;
    }
}
