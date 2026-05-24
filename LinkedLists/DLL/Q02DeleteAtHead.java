public class Q02DeleteAtHead {
    public static void main(String[] args) {
        Node head = new Node(23);
        head = insAtHead(head, 12);
        head = insAtHead(head, 15);
        head = insAtHead(head, 18);
        printList(head);
        head = deleteAtHead(head);
        System.out.println("After deleting");
        printList(head);
    }

    public static Node deleteAtHead(Node head){
        if(head==null){
            return null;
        }
        return head.next;
    }

    public static Node insAtHead(Node head, int data1){
        Node newNode = new Node(data1);
        if(head!=null){
            newNode.next=head;
            head.prev = newNode;
        }
        head=newNode;
        return newNode;
    }

    public static void printList(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
