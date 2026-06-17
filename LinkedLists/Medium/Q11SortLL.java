public class Q11SortLL {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next=null;
        ListNode left = head;
        left=sortList(left);
        right=sortList(right);
        return mergeTwoSortedLL(left,right);
    }

    public static ListNode findMiddle(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode mergeTwoSortedLL(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1, null);
        ListNode temp = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }
        else{
            temp.next=list2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(3);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        System.out.println("Before");
        printList(head);

        System.out.println("After");
        printList(sortList(head));
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