public class Q13IntersectionOfLL {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff=getDiff(headA, headB);
        if(diff<0){
            while(diff++ != 0){
                headB=headB.next;
            }
        }
        else{
            while(diff-- != 0){
                headA=headA.next;
            }
        }
        while(headA!=null){
            if(headA==headB){
                return headA;
            }
            headB=headB.next;
            headA=headA.next;
        }
        return null;
    }

    public static int getDiff(ListNode head1, ListNode head2){
        int len1=0;
        int len2=0;
        while(head1!=null || head2!=null){
            if(head1!=null){
                len1++;
                head1=head1.next;
            }
            if(head2!=null){
                len2++;
                head2=head2.next;
            }
        }
        return len1-len2;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        ListNode headB = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(1);

        headA.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        headB.next=sixth;
        sixth.next=seventh;
        seventh.next=third;

        System.out.println("Before");
        printList(headA);
        printList(headB);

        System.out.println("Intersection from");
        printList(getIntersectionNode(headA, headB));
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}