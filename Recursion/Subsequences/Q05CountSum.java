public class Q05CountSum {
    public static int countSubsequenceWithTargetSum(int[] nums, int k) {
        int ans = checkSum(nums, k, 0, 0, 0);
        return ans;
    }

    public static int checkSum(int[] nums, int k, int idx, int sum, int cnt){
        if(idx==nums.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        int left = checkSum(nums, k, idx+1, sum+nums[idx], cnt);
        int right = checkSum(nums, k, idx+1, sum, cnt);
        return left+right;
    }

    public static void main(String[] args) {
        int[] nums = {4,9,5,2,1};
        int k = 10;
        int ans = countSubsequenceWithTargetSum(nums, k);
        System.out.println(ans);
    }
}