import java.util.Arrays;

public class SelectionSort {
    public static int[] sortfn(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int mini = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
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
