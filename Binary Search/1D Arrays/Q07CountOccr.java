public class Q07CountOccr{
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 3};
        int target = 1;
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
        if(ans[0]==-1){
            System.out.println(0);
        }
        else{
            System.out.println(ans[1]-ans[0]+1);
        }
    }
}