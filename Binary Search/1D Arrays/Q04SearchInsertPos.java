public class Q04SearchInsertPos{
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = -1;
        while(low<=high){
            mid = (low+high)/2;
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
        System.out.println(low);
    }
}