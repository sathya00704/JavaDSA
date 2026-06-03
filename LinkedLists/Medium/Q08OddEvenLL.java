public class Q08OddEvenLL {
    public static ListNode oddEvenList(ListNode head) {
        if(head==null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        System.out.println("Before");
        printList(head);

        System.out.println("After");
        printList(oddEvenList(head));
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