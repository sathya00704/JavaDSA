import java.util.Arrays;


public class Q07MoveZeroesToEnd {
   public static void main(String[] args) {
       int[] arr = {1,4,0,3,2,0,8,9};
       int n=arr.length;
       int j=-1;
       for(int i=0;i<n;i++){
           if(arr[i]==0){
               j=i;
               break;
           }
       }
       System.out.println(j);
       if(j==-1){
           System.out.println(Arrays.toString(arr));
           return;
       }
       for(int i=j+1;i<n;i++){
           if(arr[i]!=0){
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               j++;
           }
       }
       System.out.println(Arrays.toString(arr));
   }
}
