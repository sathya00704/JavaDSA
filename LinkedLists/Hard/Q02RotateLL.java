public class Q02RotateLL {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int cnt=0;
        ListNode temp = head;
        while(temp!=null){
            cnt+=1;
            temp=temp.next;
        }
        k = k%cnt;
        if(k==0){
            return head;
        }
        int target=cnt-k;
        ListNode curr = head;
        for(int i=1;i<target;i++){
            curr=curr.next;
        }
        ListNode newHead=curr.next;
        curr.next=null;

        ListNode tail = newHead;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        return newHead;
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
        ListNode ans = rotateRight(head, 2);
        System.out.println("Rotated:");
        printList(ans);
    }
}