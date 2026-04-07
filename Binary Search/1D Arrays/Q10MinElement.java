public class Q10MinElement{
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int n = nums.length;
        int low=0;
        int high=n-1;
        int minele=Integer.MAX_VALUE;
        while(low <= high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[high]){
                minele=Math.min(minele, nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){
                minele=Math.min(minele,nums[low]);
                low=mid+1;
            }
            else{
                minele=Math.min(minele,nums[mid]);
                high=mid-1;
            }
        }
        System.out.println(minele);
    }
}