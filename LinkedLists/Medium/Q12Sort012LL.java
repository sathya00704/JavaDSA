public class Q12Sort012LL {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode zeroDummy = new ListNode(-1);
        ListNode oneDummy = new ListNode(-1);
        ListNode twoDummy = new ListNode(-1);

        ListNode zeroTail = zeroDummy;
        ListNode oneTail = oneDummy;
        ListNode twoTail = twoDummy;

        ListNode curr = head;

        while(curr!=null){
            if(curr.val==0){
                zeroTail.next=curr;
                zeroTail=zeroTail.next;
            }
            else if(curr.val==1){
                oneTail.next=curr;
                oneTail=oneTail.next;
            }
            else{
                twoTail.next=curr;
                twoTail=twoTail.next;
            }
            curr=curr.next;
        }
        zeroTail.next=(oneDummy.next!=null) ? oneDummy.next : twoDummy.next;
        oneTail.next=twoDummy.next;
        twoTail.next=null;

        if (zeroDummy.next != null)
            return zeroDummy.next;
        else if (oneDummy.next != null)
            return oneDummy.next;
        else
            return twoDummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        System.out.println("Before");
        printList(head);

        System.out.println("After");
        printList(sortList(head));
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}