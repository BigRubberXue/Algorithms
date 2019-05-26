package leetcode;
class No2{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = l2;
        int isUp=0;
        while(l1!=null&&l2!=null){
            l2.val=l1.val+l2.val+isUp;
            isUp=0;
            if(l2.val>=10){
                l2.val=l2.val%10;
                isUp=1;
            }
            if(l1.next==null) break;
            l1=l1.next;
            if(l2.next==null){
                l2.next=l1;
                break;
            }
            l2=l2.next;
        }
        if(l2.next==null&&isUp==1){
            l2.next=new ListNode(1);
            isUp=0;
        }
        l2=l2.next;
        while(isUp!=0){
            l2.val=l2.val+isUp;
            isUp=0;
            if(l2.val>=10){
                l2.val=l2.val%10;
                isUp=1;
            }
            if(l2.next==null&&isUp==1){
                ListNode temp = new ListNode(1);
                l2.next=temp;
                break;
            }
            l2=l2.next;
        }
        return list;
    }
    
}