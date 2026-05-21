public class Q03LenOfLL {
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
        ListNode head = new ListNode(2);
        head.next= new ListNode(3);
        head = insert(head, 7);
        head = insert(head, 4);
        head = insert(head, 9);
        System.out.println("List:");
        printList(head);

        ListNode temp = head;
        int cnt=0;
        while(temp!=null){
            cnt+=1;
            temp=temp.next;
        }
        
        System.out.println("Count:"+cnt);
    }
}