package leetcode;

import java.util.HashSet;
import java.util.Set;

public class No141 {
    //环形链表
    /*public boolean hasCycle(ListNode head) {
        ListNode pre=head;
        ListNode pre_pre=head;
        while(pre!=null&&pre.next!=null){
            pre=pre.next.next;
            pre_pre=pre_pre.next;
            if(pre==pre_pre){
                return true;
            }
        }
        return false;
    }*/

    public class Solution {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> sList = new HashSet<>();
            while(head!=null){
                if(sList.contains(head)){
                    return true;
                } else {
                    sList.add(head);
                }
                head=head.next;
            }
            return false;
        }
    }

}
