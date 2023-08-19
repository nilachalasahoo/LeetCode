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
        if(head.next==null)
            return head;
        ListNode x=head;
        head=reverse(head.next);
        x.next.next=x;
        x.next=null;
        return head;
    }
    private ListNode middle(ListNode head){
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            head=head.next;
            fast=fast.next.next;
        }
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
            return true;
        ListNode root=middle(head);
        root=reverse(root.next);
        while(root!=null){
            if(root.val!=head.val)
                return false;
            root=root.next;
            head=head.next;
        }
        return true;
    }
}
