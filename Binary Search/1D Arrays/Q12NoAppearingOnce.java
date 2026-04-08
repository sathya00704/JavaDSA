public class Q12NoAppearingOnce {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 5, 5};
        int n=nums.length;
        if(n==1) System.out.println(nums[0]);
        if(nums[0]!=nums[1]) System.out.println(nums[0]);
        if(nums[n-1]!=nums[n-2]) System.out.println(nums[n-1]);

        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                System.out.println(nums[mid]);
            }

            if((mid%2 == 0 && nums[mid]==nums[mid+1]) ||
                (mid%2 == 1 && nums[mid]==nums[mid-1])){
                    low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(-1); //use return to avoid unnecessary print of -1.
    }
}