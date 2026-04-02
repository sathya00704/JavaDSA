import java.util.Arrays;

public class Q06FirstLastOccr{
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = {-1,-1};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        //FIRST OCCURRENCE 
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                ans[0]=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        //LAST OCCURRENCE 
        low = 0;
        high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                ans[1]=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}