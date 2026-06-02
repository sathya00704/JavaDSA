public class Q07PalindromeLL {
    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        //Finding Middle Node
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secondHalfHead = reverse(slow.next);
        //Comparison
        ListNode firstHalf=head;
        ListNode secondHalf=secondHalfHead;

        boolean isPal = true;
        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val){
                isPal = false;
                break;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        //Restore Original list
        slow.next=reverse(secondHalfHead);
        return isPal;
    }

    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);
        //ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        //fifth.next = null;

        System.out.println(isPalindrome(head));
    }
}