import java.util.Stack;

public class Q05ReverseStack {
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        
        int top = st.pop();
        reverseStack(st);
        insertReversed(st, top);
    }

    private static void insertReversed(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        insertReversed(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> inp = new Stack<>();
        inp.push(4);
        inp.push(3);
        inp.push(1);
        inp.push(2);
        System.out.println("Before (bottom->top) "+inp);
        reverseStack(inp);
        System.out.println("After (bottom->top) "+inp);
        

    }
}