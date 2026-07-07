public class Q14Add1toLLNum {
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode addOne(ListNode head) {
        head=reverse(head);
        ListNode curr = head;
        int carry = 1; //To add 1
        while(curr!=null && carry>0){
            int sum=curr.val+carry;
            curr.val=sum%10;
            carry=sum/10;

            if(curr.next==null && carry>0){
                curr.next=new ListNode(carry);
                carry=0;
            }
            curr=curr.next;
        }
        return reverse(head);
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
        ListNode head = new ListNode(9);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(9);

        head.next = second;
        second.next = third;
        third.next = null;

        printList(addOne(head));
    }
}
