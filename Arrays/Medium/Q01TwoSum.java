import java.util.*;

public class Q01TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, -7, 6, -3};
        int target = 0;
        int n = arr.length;
        HashMap <Integer, Integer> hm = new HashMap<>();
        int[] ans = {-1,-1};
        for(int i=0;i<n;i++){
            if(hm.containsKey(target-arr[i])){
                ans[0]=hm.get(target-arr[i]);
                ans[1]=i;
                break;
            }
            else{
                hm.put(arr[i], i);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
