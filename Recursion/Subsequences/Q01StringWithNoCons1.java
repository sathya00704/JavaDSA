import java.util.ArrayList;
import java.util.List;

public class Q01StringWithNoCons1 {
    public static List<String> generateBinaryStrings(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(0,n,false,sb,ans);
        return ans;
    }

    private static void backtrack(int idx, int n, boolean prev, StringBuilder sb, List<String> ans){
        if(idx==n){
            ans.add(sb.toString());
            return;
        }
        sb.append('0');
        backtrack(idx+1, n, false, sb, ans);
        sb.deleteCharAt(sb.length()-1);

        if(!prev){
            sb.append('1');
            backtrack(idx+1, n, true, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        int n=3;
        List<String> ans = generateBinaryStrings(n);
        for(String i: ans){
            System.out.println(i);
        }
    }
}