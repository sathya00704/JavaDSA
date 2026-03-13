import java.util.Arrays;

public class InsertionSort {
    public static int[] sortfn(int[] arr, int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3,6,2,1,5,4};
        int n = arr.length;
        sortfn(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
