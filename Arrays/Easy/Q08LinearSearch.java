public class Q08LinearSearch {
   public static void main(String[] args) {
       int[] arr = {8,9,4,3,0};
       int n=arr.length;
       int srch=2;
       for(int i=0;i<n;i++){
           if(arr[i]==srch){
               System.out.println(i);
               return;
           }
       }
       System.out.println("Not found");
   }
}
