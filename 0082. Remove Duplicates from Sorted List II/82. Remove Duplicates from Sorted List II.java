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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode root=new ListNode(0);
        root.next=head;
        head=root;
        while(head.next!=null && head.next.next!=null){
            if(head.next.val==head.next.next.val){
                int d=head.next.val;
                while(head.next!=null && head.next.val==d){
                    head.next=head.next.next;
                }
            }else{
                head=head.next;
            }
        }
        return root.next;
    }
}
