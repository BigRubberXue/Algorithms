/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
package leetcode;
class No21{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         /*
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        while(true){
            if(l2.val<l1.val){
                temp.next=l2;
                l2=l2.next;
            }else{
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
            if(l1==null||l2==null){
                break;
            }
            
        }
        if(l1==null){
            temp.next=l2;
        }else{
            temp.next=l1;
        }
        return head.next;
        */
        if(l1==null){return l2;}
        else if(l2==null){return l1;}
        else if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{ 
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}