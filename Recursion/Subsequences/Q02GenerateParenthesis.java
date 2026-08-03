import java.util.*;

public class Q02GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List <String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(n,0,0,sb,ans);
        return ans;
    }

    private static void backtrack(int n, int open, int close, StringBuilder sb, List<String> ans){
        if(sb.length()==2*n){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            backtrack(n, open+1, close, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            backtrack(n, open, close+1, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        int n=3;
        List<String> ans = generateParenthesis(n);
        for(String i: ans){
            System.out.println(i);
        }
    }
}