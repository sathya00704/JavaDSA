public class Q03RemoveDup {
    public static void main(String[] args) {
        Node head = new Node(1);
        head = insAtHead(head, 1);
        head = insAtHead(head, 1);
        head = insAtHead(head, 2);
        head = insAtHead(head, 5);
        head = insAtHead(head, 6);
        printList(head);
        head = removeDup(head);
        System.out.println("After removing duplicates");
        printList(head);
    }

    public static Node removeDup(Node head){
        if(head==null) return head;
        Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                curr.next=curr.next.next;
                if (curr.next != null) {
                    curr.next.prev = curr;
                }
            }else{
                curr=curr.next;
            }
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