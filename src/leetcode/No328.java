package leetcode;
class No328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode l1 = head;
        ListNode l2 = l1.next;
        ListNode temp = l2;
        while(l2!=null&&l1!=null&&l2.next!=null){
            l1.next=l2.next;
            l1=l1.next;
            l2.next=l1.next;
            l2=l2.next;
        }
        l1.next = temp;
        return head;
    }
}