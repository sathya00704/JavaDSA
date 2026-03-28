import java.util.HashMap;

public class Q05LongestSubarraySum0 {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        int sum=0;
        int longcnt=0;
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                longcnt=i+1;
            }
            else{
                if(hm.containsKey(sum)){
                    longcnt = Math.max(longcnt, i - hm.get(sum));
                }
                // store first occurrence
                if(!hm.containsKey(sum)){
                    hm.put(sum, i);
                }
            }
            
        }
        System.out.println(longcnt);
    }
}
