public class Q10SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k=2;
        int n = nums.length;
        int low=0,high=0;
        for(int i=0;i<n;i++){
            high+=nums[i];
            if(nums[i]>low){
                low=nums[i];
            }
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(arrsplit(nums,mid,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }

    public static boolean arrsplit(int[] nums, int mid, int k){
        int sumsub=0;
        int cnt=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+sumsub>mid){
                cnt++;
                sumsub=nums[i];
            }
            else{
                sumsub+=nums[i];
            }
        }
        if(cnt<=k){
            return true;
        }
        return false;
    }
}