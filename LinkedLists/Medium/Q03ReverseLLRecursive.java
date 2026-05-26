public class Q03ReverseLLRecursive {
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next=head;
        head.next=null;
        return newHead;
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