import java.util.Arrays;

public class Q08AggressiveCows{
    public static void main(String[] args) {
        int nums[] = {0, 3, 4, 7, 10, 9};
        int n=nums.length;
        int cows=4;
        Arrays.sort(nums);
        int low=0;
        int high=nums[n-1]-nums[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canPlace(nums,mid,cows)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(high);
    }

    public static boolean canPlace(int[] nums, int mid, int cows){
        int cnt=1;
        int last=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last>=mid){
                cnt++;
                last=nums[i];
                if(cnt>=cows){
                    return true;
                }
            }
        }
        return false;
    }
}