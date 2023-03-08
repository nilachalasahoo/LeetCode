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
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode res;
        if(l1.val<l2.val){
            res=new ListNode(l1.val);
            l1=l1.next;
        }else{
            res=new ListNode(l2.val);
            l2=l2.next;
        }
        ListNode temp=res;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=new ListNode(l1.val);
                l1=l1.next;
                temp=temp.next;
            }else{
                temp.next=new ListNode(l2.val);
                l2=l2.next;
                temp=temp.next;
            }
        }
        if(l1!=null){
            temp.next=l1;
        }
        if(l2!=null){
            temp.next=l2;
        }
        return res;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res=null;
        for(int i=0;i<lists.length;i++){
            res=merge(res,lists[i]);
        }
        return res;
    }
}
