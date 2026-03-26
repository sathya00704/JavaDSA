import java.util.HashMap;

public class Q14CntSubarraywithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int n=arr.length;
        int k=3;
        int prefixSum=0;
        int cnt=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum = prefixSum + arr[i];
            int var = prefixSum - k;
            if(hm.containsKey(var)){
                cnt=cnt+hm.get(var);
            }

            if(hm.containsKey(prefixSum)){
                hm.put(prefixSum, hm.get(prefixSum)+1);
            }
            else{
                hm.put(prefixSum, cnt);
            }
        }
        System.out.println(hm+" "+cnt);
    }
}
