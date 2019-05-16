package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class No24 {
    public ListNode swapPairs(ListNode head) {
        //两两交换链表中的节点
        ListNode pre=head;
        ListNode pre_pre=head;
        ListNode cur=new ListNode(-1);
        ListNode local = cur;
        while(true){
            if(head!=null){
                pre_pre=head;
                if(head.next!=null){
                    pre=head.next;
                    head=pre.next;
                    local.next=pre;
                    pre.next=pre_pre;
                    local=pre_pre;
                    pre_pre.next=null;
                }else{
                    local.next=pre_pre;
                    pre_pre.next=null;
                    break;
                }
            }else{
                break;
            }
        }
        return cur.next;
    }
}

