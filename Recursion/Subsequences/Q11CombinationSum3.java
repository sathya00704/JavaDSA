import java.util.ArrayList;
import java.util.List;

public class Q11CombinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(k, n, 1, 0, 0, new ArrayList<>(), res);
        return res;
    }

    public static void backtrack(int k, int n, int start, int sum, int cnt, List<Integer> curr, List<List<Integer>> res){
        if(k==cnt){
            if(sum==n){
                res.add(new ArrayList<>(curr));
                return;
            }
        }
        if(sum>n){
            return;
        }
        for(int i=start;i<10;i++){
            curr.add(i);
            backtrack(k, n, i+1, sum+i, cnt+1, curr, res);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int k=3;
        int n=9;
        System.out.println(combinationSum3(k,n));
    }
}