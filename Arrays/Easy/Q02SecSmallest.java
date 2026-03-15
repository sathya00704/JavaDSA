public class Q02SecSmallest {
   public static void main(String[] args) {
       int[] arr = {9,4,3,2,7};
       int n = arr.length;
       if(n<=1){
           System.out.println("Enter more than 1 element to find min/second min");
           return;
       }
       int min=Integer.MAX_VALUE;
       int smin=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
           if(arr[i]<min){
               smin=min;
               min=arr[i];
           }
           else if(arr[i]<smin && min!=arr[i]){
               smin=arr[i];
           }
       }
       if(smin==Integer.MAX_VALUE){
           System.out.println("Second minimum doesnot exist");
           System.out.println("Minimum="+min);
       }else{
           System.out.println("Minimum="+min+" &Second minimum="+smin);
       }
   }
}
