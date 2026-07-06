public class Q15Add2Num {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(3);

        ListNode fourth = new ListNode(5);
        ListNode fifth = new ListNode(6);
        ListNode sixth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = null;

        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next=null;

        printList(addTwoNumbers(head,fourth));
    }
}
