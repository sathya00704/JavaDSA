public class Q03RevDLL {
    public static void main(String[] args) {
        Node head = new Node(23);
        head = insAtHead(head, 12);
        head = insAtHead(head, 15);
        head = insAtHead(head, 18);
        printList(head);
        System.out.println("Reversed");
        head=revDLL(head);
        printList(head);
    }

    public static Node revDLL(Node head){
        Node curr=head;
        Node temp=null;

        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;

            curr=curr.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
        return head;
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
