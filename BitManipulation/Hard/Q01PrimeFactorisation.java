import java.util.ArrayList;
import java.util.List;

//Not using Bit manipulation
public class Q01PrimeFactorisation {
    public static List<List<Integer>> primeFactors(int[] queries) {
        //your code goes here
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int num=queries[i];
            List<Integer> ans = new ArrayList<>();
            for(int j=2;j * j <= num;j++){
                while(num%j==0){
                    num=num/j;
                    ans.add(j);
                }
            }
            if(num>1){
                ans.add(num);
            }
            res.add(ans);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] queries = new int[]{2,3,6,10,12};
        List<List<Integer>> res = primeFactors(queries);
        System.out.println(res);
    }
}