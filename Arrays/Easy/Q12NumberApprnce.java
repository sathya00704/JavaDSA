public class Q12NumberApprnce {
   public static void main(String[] args) {
       int[] arr = {1,1,3,3,4,4,9};
       int n = arr.length;
       int xorval=0;
       for(int i=0;i<n;i++){
           xorval=arr[i]^xorval;
       }
       System.out.println(xorval);
   }
}
