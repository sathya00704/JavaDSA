import java.util.Arrays;


public class Q05LeftRotation {
   public static void main(String[] args) {
       int[] arr = {1,5,4,2,6};
       int n = arr.length;
       int temp=arr[0];
       for(int i=0;i<n-1;i++){
           arr[i]=arr[i+1];
       }
       arr[n-1]=temp;
       System.out.println(Arrays.toString(arr));
   }
}
