package leetcode;
class No61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode l1 = head;
        ListNode fast = head;
        int local = 0;
        while(fast.next!=null){
            local++;
            fast=fast.next;
        }
        local++;
        fast.next = head;
        int mid = local-k%local;
        local=1;
        while(local<mid){
            l1=l1.next;
            local++;
        }
        head = l1.next;
        l1.next=null;
        return head;
    }
    
    
}