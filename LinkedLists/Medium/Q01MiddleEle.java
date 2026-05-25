public class Q01MiddleEle {
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
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
        head = insert(head, 8);
        System.out.println("List:");
        printList(head);
        ListNode ans = middleNode(head);
        System.out.println("Middle:");
        printList(ans);
    }
}