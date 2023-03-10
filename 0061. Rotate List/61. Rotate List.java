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
    public ListNode rotateRight(ListNode head, int k) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        if(k==0 ||head==null || head.next==null)
            return head;
        k=k%n;
        if(k==0)
            return head;
        k=n-k;
        temp=head;
        while(k>1){
            temp=temp.next;
            k--;
        }
        ListNode x=temp.next;
        temp.next=null;
        temp=x;
        while(x.next!=null){
            x=x.next;
        }
        x.next=head;
        return temp;
    }
}
