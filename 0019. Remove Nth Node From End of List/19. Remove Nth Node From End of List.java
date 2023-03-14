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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int x=0;
        while(temp!=null){
            x++;
            temp=temp.next;
        }
        if(x==n)
            return head.next;
        x=x-n-1;
        temp=head;
        while(x>0){
            temp=temp.next;
            x--;
        }
        temp.next=temp.next.next;
        return head;
    }
}
