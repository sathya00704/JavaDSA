public class Q04SearchLL {
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }


    public static ListNode insert(ListNode head, int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        return newNode;
    }

    public static void main(String[] args) {
        int target = 4;
        ListNode head = new ListNode(2);
        head.next= new ListNode(3);
        head = insert(head, 7);
        head = insert(head, 4);
        head = insert(head, 9);
        System.out.println("List:");
        printList(head);

        ListNode temp = head;
        while(temp!=null){
            if(temp.val == target){
                System.out.println("Found");
                return;
            }
            temp=temp.next;
        }
        
        System.out.println("Not found");
    }
}