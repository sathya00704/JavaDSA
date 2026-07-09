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

public class Q01DeleteTargetInt {
    public static void main(String[] args) {
        Node head = new Node(23);
        head = insAtHead(head, 12);
        head = insAtHead(head, 15);
        head = insAtHead(head, 12);
        head = insAtHead(head, 15);
        head = insAtHead(head, 16);
        printList(head);
        int target = 12;
        head = deleteTarget(head, target);
        System.out.println("After deleting");
        printList(head);
    }

    public static Node deleteTarget(Node head, int target){
        Node curr = head;
        while(curr!=null){
            Node nn = curr.next;
            if(curr.data==target){
                if(curr.prev!=null){
                    curr.prev.next=curr.next;
                }
                else{
                    head=curr.next;
                }
                if(curr.next!=null){
                    curr.next.prev=curr.prev;
                }
            }
            curr=nn;
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