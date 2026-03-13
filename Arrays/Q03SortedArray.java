public class Q03SortedArray {
   public static void main(String[] args) {
       int[] arr = {7,8,9,18,28};
       int n = arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                System.out.println(arr[i]+" "+arr[j]);
//                if(arr[i]>arr[j]){
//                    System.out.println(false);
//                    return;
//                }
//            }
//        }
       for(int i=1;i<n;i++) {
           if (arr[i] < arr[i - 1]) {
               System.out.println(false);
               return;
           }
       }
       System.out.println(true);
   }
}