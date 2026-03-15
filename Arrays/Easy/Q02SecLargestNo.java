import java.util.*;

public class Q02SecLargestNo
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
       sc.close();
       
       if(m<=1){
           System.out.println("Enter more than 1 element to find max & second max");
           return;
       }

       int max=Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;
       boolean foundSecond=false;

       for(int i=0;i<m;i++){
           if(arr[i]>max){
               smax=max;
               max=arr[i];
               foundSecond=true;
           }
           else if(arr[i]>smax && arr[i]!=max){
               smax=arr[i];
               foundSecond=true;
           }
       }

       if(!foundSecond){
           System.out.println("Second maximum does not exist");
           System.out.println("Maximum="+max);
       }
       else{
           System.out.println("Maximum="+max+" & Second max = "+smax);
       }
   }
}