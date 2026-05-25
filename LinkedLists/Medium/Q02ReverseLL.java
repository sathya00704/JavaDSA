public class Q02ReverseLL {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextPtr = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPtr;
        }
        return prev;
    }

    public static ListNode insert(ListNode head, int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        return newNode;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next= new ListNode(3);
        head = insert(head, 7);
        head = insert(head, 4);
        head = insert(head, 9);
        System.out.println("List:");
        printList(head);
        ListNode ans = reverseList(head);
        System.out.println("Reversed:");
        printList(ans);
    }
}