public class Q02DeleteANode {
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        ListNode head = new ListNode(2);
        head.next= new ListNode(3);
        System.out.println("Initial:");
        printList(head);

        deleteNode(head); //here deleting the first node
        
        System.out.println("After Deletion");
        printList(head);
    }
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}