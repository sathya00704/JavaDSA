import java.util.*;

//Calculating the longest subarray containing both positives and negatives with a Sum K.
public class Q14LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k=15;
        int n = arr.length;
        int sum = 0;
        int longcnt = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
            // case 1: subarray from 0 to i
            if(sum == k){
                longcnt = i + 1;
            }
            // case 2: check if sum-k exists
            //Explained in detail below!
            //We check if there was a previous prefix sum equal to: sum - k
            if(hm.containsKey(sum - k)){
                longcnt = Math.max(longcnt, i - hm.get(sum - k));
            }
            // store first occurrence
            if(!hm.containsKey(sum)){
                hm.put(sum, i);
            }
        }
        System.out.println("end:"+hm+" "+longcnt);
    }
}

/* WHY CASE 2 SUM-K???
Array : [10,5,2,7,1,-10]
k = 15

At index 4:
sum = 25

Compute sum - k = 25 - 15 = 10
Check if 10 exists in the map.

Map contains: 10 → index 0

So subarray: 1 → 4
[5,2,7,1]

Length:
4 - 0 = 4

Sum:
5+2+7+1 = 15

Correct.
 */