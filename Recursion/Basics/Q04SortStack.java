import java.util.Stack;

public class Q04SortStack {
    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        sortStack(st);
        insertSorted(st, top);
    }

    private static void insertSorted(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }

        int top = st.pop();
        insertSorted(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> inp = new Stack<>();
        inp.push(4);
        inp.push(3);
        inp.push(1);
        inp.push(2);
        System.out.println("Before");
        for(Integer i: inp){
            System.out.print(i+" ");
        }
        sortStack(inp);
        System.out.println();
        System.out.println("After");
        for(Integer i: inp){
            System.out.print(i+" ");
        }

    }
}