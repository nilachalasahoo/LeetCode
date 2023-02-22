/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
            if(a!=null){
                a=a.next;
            }else{
                a=headB;
            }
            if(b!=null){
                b=b.next;
            }else{
                b=headA;
            }
        }
        return a;
    }
}
