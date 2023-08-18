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
    public ListNode partition(ListNode head, int x) {
        ListNode root=new ListNode(0);
        ListNode temp1=root;
        ListNode temp2=new ListNode(1);;
        ListNode temp3=temp2;
        while(head!=null){
            if(head.val<x){
                temp1.next=head;
                temp1=temp1.next;
            }else{
                temp3.next=head;
                temp3=temp3.next;
            }
            head=head.next;
        }
        temp3.next=null;
        temp1.next=temp2.next;
        return root.next;
    }
}
