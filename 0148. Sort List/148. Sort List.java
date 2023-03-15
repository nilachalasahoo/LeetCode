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
    public ListNode mid(ListNode head){
        if(head==null)
            return head;
        ListNode mid=head;
        head=head.next;
        while(head!=null && head.next!=null){
            head=head.next.next;
            mid=mid.next;
        }
        return mid;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode mid=mid(head);
        ListNode temp=mid.next;
        mid.next=null;
        head=sortList(head);
        temp=sortList(temp);
        head=merge(head,temp);
        return head;
    }
    public ListNode merge(ListNode head1,ListNode head2){
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        ListNode head;
        if(head1.val<=head2.val){
            head=head1;
            head1=head1.next;
        }else{
            head=head2;
            head2=head2.next;
        }
        ListNode temp=head;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head1!=null){
            temp.next=head1;
        }
        if(head2!=null){
            temp.next=head2;
        }
        return head;
    }
}
