class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2 child;

    ListNode2() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode2(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode2(int data1, ListNode2 next1, ListNode2 next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}

public class Q03FlattenLL {
    public static ListNode2 flattenLL(ListNode2 head) {
        if(head==null || head.next==null){
            return head;
        }

        head.next=flattenLL(head.next);
        head=merge(head,head.next);
        return head;
    }

    public static ListNode2 merge(ListNode2 a, ListNode2 b){
        ListNode2 dummy=new ListNode2(-1);
        ListNode2 temp = dummy;

        while(a!=null && b!=null){
            if(a.val <= b.val){
                temp.child=a;
                a=a.child;
            }
            else{
                temp.child=b;
                b=b.child;
            }
            temp=temp.child;
            temp.next=null;
        }
        if(a!=null)
            temp.child=a;
        else
            temp.child=b;
        return dummy.child;
    }

    public static void printList(ListNode2 head){
        ListNode2 temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.child;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode2 head = new ListNode2(4);
        ListNode2 second = new ListNode2(10);
        ListNode2 third = new ListNode2(2);
        ListNode2 fourth = new ListNode2(5);
        ListNode2 fifth = new ListNode2(20);
        ListNode2 sixth = new ListNode2(12);
        ListNode2 seventh = new ListNode2(13);
        ListNode2 eighth = new ListNode2(16);
        ListNode2 ninth = new ListNode2(17);

        head.next = third;
        head.child=second;

        third.child=fourth;
        fourth.child=fifth;
        third.next=sixth;

        sixth.child=seventh;
        seventh.child=eighth;
        eighth.child=ninth;

        ListNode2 ans = flattenLL(head);
        System.out.println("Rotated:");
        printList(ans);
    }
}