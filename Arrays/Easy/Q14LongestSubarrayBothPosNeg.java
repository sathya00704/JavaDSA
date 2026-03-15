import java.util.*;

//Calculating the longest subarray containing both positives and negatives with a Sum ZERO.
public class Q14LongestSubarrayBothPosNeg {
    public static void main(String[] args) {
        int[] arr = {9, -2, 3, -1, 6, -5};
        int n=arr.length;
        int sum=0;
        int longcnt=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i=0;
        while(i<n){
            sum=sum+arr[i];
            System.out.println("top:"+i+" "+sum+" "+longcnt);
            if(sum==0){
                System.out.println("In first loop"+i);
                longcnt=i+1;
            }
            else{
                if(hm.containsKey(sum))
                {
                    System.out.println("In second if loop"+i);
                    if(i - hm.get(sum) > longcnt){
                        System.out.println("In third if loop"+i);
                        longcnt=i-hm.get(sum);
                        System.out.println("updated longcnt:"+longcnt);
                    }
                }
                else{
                    hm.put(sum, i);
                }
            }
            System.out.println("updating i and updated hm="+hm);
            i++;
        }
        System.out.println("end:"+hm+" "+longcnt);
    }
}
