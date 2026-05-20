class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Q01InsAtHead {
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
        System.out.println("Initial:");
        printList(head);

        ListNode newNode = new ListNode(1);
        newNode.next=head;
        head=newNode;
        
        System.out.println("Modified");
        printList(head);
    }
}