package leetcode;
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

public class No160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        int lenA = 0;
        while(l1!=null){
            lenA++;
            l1=l1.next;
        }
        int lenB = 0;
        while(l2!=null){
            lenB++;
            l2=l2.next;
        }
        int dep = 0;
        if(lenB>lenA){
            dep=lenB-lenA;
            while(dep>0){
                headB=headB.next;
                dep--;
            }
        }else{
            dep=lenA-lenB;
            while(dep>0){
                headA=headA.next;
                dep--;
            }
        }
        while(headA!=headB){
            if(headA.next==null){
                return null;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
        
        
        
    }
}