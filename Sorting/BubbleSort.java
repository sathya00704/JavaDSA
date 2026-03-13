import java.util.Arrays;

public class BubbleSort {
    public static int[] sortfn(int[] arr, int n){
        for(int i=0;i<n;i++){
            int didswap=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                break;
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
