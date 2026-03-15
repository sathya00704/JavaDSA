import java.util.*;

public class Q01LargestNo
{
   public static void main(String[] args) {
       int m=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter array dimension=");
       m=sc.nextInt();

       int[] arr = new int[m];

       System.out.println("Enter array elements");
       for(int i=0; i<m; i++) {
           arr[i]=sc.nextInt();
       }

       int max=Integer.MIN_VALUE;

       for(int i=0;i<m;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
       System.out.println("Maximum="+max);
       sc.close();
   }
}