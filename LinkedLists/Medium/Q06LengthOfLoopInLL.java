public class Q06LengthOfLoopInLL {
    public static int findLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode curr = slow.next;
                int length=1;
                while(slow!=curr){
                    length+=1;
                    curr=curr.next;
                }
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        System.out.println(findLength(head));
    }
}