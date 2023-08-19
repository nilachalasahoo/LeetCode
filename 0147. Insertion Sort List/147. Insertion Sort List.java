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
    private int length(ListNode head){
        int x=0;
        while(head!=null){
            x++;
            head=head.next;
        }
        return x;
    }
    public ListNode insertionSortList(ListNode head) {
        int n=length(head);
        if(n<=1)
            return head;
        ListNode temp=head;
        for(int i=1;i<n;i++){
            if(temp.next.val<head.val){
                ListNode x=temp.next;
                temp.next=temp.next.next;
                x.next=head;
                head=x;
            }else{
                ListNode x=head;
                int j;
                for(j=1;j<i;j++){
                    if(x.next.val>temp.next.val){
                        ListNode t=temp.next;
                        temp.next=temp.next.next;
                        t.next=x.next;
                        x.next=t;
                        break;
                    }
                    x=x.next;
                }
                if(j==i)
                    temp=temp.next;
            }
        }
        return head;
    }
}
