import java.util.*;

public class Q04DupRemoval {
   public static void main(String[] args) {
       int[] arr = {4,4,5,5,5,5,6,7,8};
       int n = arr.length;
       int j=0;
       for(int i=1;i<n;i++){
           if(arr[j]!=arr[i]){
               j++;
               arr[j]=arr[i];
           }
       }
       System.out.println(j+1);
//        HashSet <Integer> hs = new HashSet<>();
//        for(int i=0;i<n;i++){
//            hs.add(arr[i]);
//        }
//        System.out.println(hs);
       System.out.println(Arrays.toString(arr));
   }
}
