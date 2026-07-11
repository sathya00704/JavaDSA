import java.util.*;

public class Q02PairSum {
    public static void main(String[] args) {
        Node head = new Node(1);
        head = insAtHead(head, 2);
        head = insAtHead(head, 3);
        head = insAtHead(head, 5);
        head = insAtHead(head, 5);
        head = insAtHead(head, 6);
        printList(head);
        int target = 7;
        System.out.println("Result");
        ArrayList<ArrayList<Integer>> al = findSum(head, target);
        for(ArrayList<Integer> i: al){
            for(Integer j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //Optimal
    public static ArrayList<ArrayList<Integer>> findSum(Node head, int target){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(head==null) return ans;
        Node right = head;
        while(right.next != null){
            right=right.next;
        }

        Node left=head;
        while(left!=null && right!=null && left!=right && right.next!=left){
            int sum=left.data + right.data;
            if(sum==target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);
                left=left.next;
                right=right.prev;
            }
            else if(sum<target){
                left=left.next;
            }
            else{
                right=right.prev;
            }
        }
        return ans;
    }

    //Non-Optimal Solution
    // public static ArrayList<ArrayList<Integer>> findSum(Node head, int target){
    //     Node curr = head;
    //     HashSet<Integer> hs = new HashSet<>();
    //     ArrayList<ArrayList<Integer>> al = new ArrayList<>();
    //     while(curr!=null){
    //         int rem = target - curr.data;
    //         if(hs.contains(rem)){
    //             ArrayList<Integer> num = new ArrayList<>();
    //             num.add(rem);
    //             num.add(curr.data);
    //             al.add(num);
    //         }
    //         else{
    //             hs.add(curr.data);
    //         }
    //         curr=curr.next;
    //     }
    //     return al;
    // }

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