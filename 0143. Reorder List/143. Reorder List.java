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
    private ListNode middle(ListNode head){
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            head=head.next;
            fast=fast.next.next;
        }
        return head;
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode x=head;
        head=reverse(head.next);
        x.next.next=x;
        x.next=null;
        return head;
    }
    public void reorderList(ListNode head) {
        if(head.next==null)
            return;
        ListNode mid=middle(head);
        ListNode temp=reverse(mid.next);
        mid.next=null;
        mid=temp;
        ListNode root=new ListNode(0);
        temp=root;
        while(mid!=null){
            temp.next=head;
            temp=head;
            head=head.next;
            temp.next=mid;
            temp=mid;
            mid=mid.next;
        }
        if(head!=null){
            temp.next=head;
        }
        head=root.next;
    }
}
