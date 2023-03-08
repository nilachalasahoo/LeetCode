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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x=l1.val+l2.val;
        int r=x/10;
        ListNode res=new ListNode(x%10);
        ListNode temp=res;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null && l2!=null){
            x=r+l1.val+l2.val;
            temp.next=new ListNode(x%10);
            r=x/10;
            l1=l1.next;
            l2=l2.next;
            temp=temp.next;
        }
        while(l1!=null){
            x=r+l1.val;
            temp.next=new ListNode(x%10);
            r=x/10;
            l1=l1.next;
            temp=temp.next;
        }
        while(l2!=null){
            x=r+l2.val;
            temp.next=new ListNode(x%10);
            r=x/10;
            l2=l2.next;
            temp=temp.next;
        }
        if(r>0){
            temp.next=new ListNode(r);
        }
        return res;
    }
}
