package leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class No234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(true){
            stack.push(slow.val);
            if(fast==null){
                //double
                int i=stack.pop();
                int j=stack.pop();
                if(i!=j){
                    return false;
                }
                break;
            }else if(fast.next==null){
                //sigle
                stack.pop();
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=slow.next;
        while(slow!=null){
            if(!stack.pop().equals(slow.val)){
                return false;
            }
            slow=slow.next;
        }

        return true;
        
    }
}