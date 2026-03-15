import java.util.Arrays;

public class Q02Sorting{
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,2,2,1,1,0,1,2,1,0};
        int n = arr.length;
        int low=0;
        int high=n-1;
        int mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}