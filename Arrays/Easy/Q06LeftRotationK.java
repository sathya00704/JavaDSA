import java.util.Arrays;

public class Q06LeftRotationK {
   public static int[] reverseArray(int arr[], int start, int end){
       while(start<end){
           int temp = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
       return arr;
   }
   public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8};
       int n= arr.length;
       System.out.println("Initial: "+Arrays.toString(arr));
       int k=12;
       k=k%n;
       arr=reverseArray(arr, 0, k-1);
       arr=reverseArray(arr, k, n-1);
       arr=reverseArray(arr, 0, n-1);
       System.out.println("Left: "+Arrays.toString(arr));


       arr=reverseArray(arr, 0, n-1);
       arr=reverseArray(arr,0, k-1);
       arr=reverseArray(arr, k, n-1);
       System.out.println("Right: "+Arrays.toString(arr));
   }
}
