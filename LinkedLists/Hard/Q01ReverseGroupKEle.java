public class Q01ReverseGroupKEle {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode groupPrev=dummy;
        while(true){
            ListNode kth = getKthNode(groupPrev, k);
            if (kth==null) break;
            ListNode groupNext=kth.next;
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;
            for(int i=0;i<k;i++){
                ListNode temp = curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            ListNode temp = groupPrev.next;
            groupPrev.next=kth;
            groupPrev=temp;
        }
        return dummy.next;
    }

    private static ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    public static ListNode insert(ListNode head, int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        return newNode;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
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
        ListNode ans = reverseKGroup(head, 2);
        System.out.println("Reversed:");
        printList(ans);
    }
}