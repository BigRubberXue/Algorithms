package leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class No148 {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode midp = getMid(head);//
        ListNode mid =midp.next;
        midp.next=null;
        return mergeList(sortList(head),sortList(mid));
    }
    
    public ListNode mergeList(ListNode h1,ListNode h2){
        ListNode res = new ListNode(0);
        ListNode head = res;
        while(h1!=null&&h2!=null){
            if(h1.val<h2.val){
                head.next = h1;
                h1=h1.next;
            }else{
                head.next = h2;
                h2=h2.next;
            }
            head=head.next;
        }
        if(h1!=null){
            head.next=h1;
        }else if(h2!=null){
            head.next=h2;
        }
        return res.next;
        
    }
    

    
    
    
    public ListNode getMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode high = head;
        ListNode low = head;
        while(high.next!=null&&high.next.next!=null){
            low=low.next;
            high=high.next.next;
        }
        return low;
    }
}