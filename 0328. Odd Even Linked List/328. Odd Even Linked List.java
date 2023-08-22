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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode root1=new ListNode(0);
        ListNode root2=new ListNode(0);
        ListNode x1=root1,x2=root2;
        int c=0;
        while(head!=null){
            if(c%2==0){
                x1.next=head;
                x1=head;
            }else{
                x2.next=head;
                x2=head;
            }
            c++;
            head=head.next;
        }
        x1.next=root2.next;
        x2.next=null;
        return root1.next;
    }
}
