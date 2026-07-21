// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Q04DeepCopy {
    public static Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        insertCopyInBtw(head);
        connectRandomPtr(head);
        return getDeepCopyList(head);
    }

    public static void insertCopyInBtw(Node head){
        Node temp=head;
        while(temp!=null){
            Node nextEle = temp.next;
            Node copy = new Node(temp.val);
            copy.next=nextEle;
            temp.next=copy;
            temp=nextEle;
        }
    }

    public static void connectRandomPtr(Node head){
        Node temp = head;
        while(temp!=null){
            Node copyNode = temp.next;
            if(temp.random!=null){
                copyNode.random=temp.random.next;
            }
            else{
                copyNode.random=null;
            }
            temp=temp.next.next;
        }
    }

    public static Node getDeepCopyList(Node head){
        Node temp=head;
        Node dummy=new Node(-1);
        Node res = dummy;
        while(temp!=null){
            res.next=temp.next;
            res=res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }

    public static void printClonedLinkedList(Node head) {
        while (head != null) {
            System.out.print("Data: " + head.val);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.val);
            } else {
                System.out.print(", Random: null");
            }
            System.out.println();
            // Move to the next node
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Example linked list: 7 -> 14 -> 21 -> 28
        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);
        head.next.next.next = new Node(28);

        // Assigning random pointers
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        System.out.println("Original Linked List with Random Pointers:");
        printClonedLinkedList(head);

        // Clone the linked list
        Node clonedList = copyRandomList(head);

        System.out.println("\nCloned Linked List with Random Pointers:");
        printClonedLinkedList(clonedList);
    }
}