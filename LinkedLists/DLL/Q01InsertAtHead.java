class Node{
    int data;
    Node prev;
    Node next;

    Node(int data1, Node prev1, Node next1){
        data=data1;
        prev=prev1;
        next=next1;
    }

    Node(int data1){
        data=data1;
        prev=null;
        next=null;
    }
}

public class Q01InsertAtHead{
    public static void printList(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(5);

        head = insertAtHead(head, 10);
        head = insertAtHead(head, 20);

        printList(head);
    }

    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        return newNode;
    }
}