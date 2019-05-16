package leetcode;


public class No204 {
    //反转链表
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode mid = cur.next;
            cur.next=pre;
            pre=cur;
            cur=mid;
        }
        return pre;
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}