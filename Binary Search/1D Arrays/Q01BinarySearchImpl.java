public class Q01BinarySearchImpl {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(-1);
    }
}
