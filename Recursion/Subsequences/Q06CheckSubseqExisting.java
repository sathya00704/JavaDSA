public class Q06CheckSubseqExisting {
    public static boolean checkSubsequenceSum(int[] nums, int k) {
        boolean ans = checkSum(nums, k, 0, 0);
        return ans;
    }

    public static boolean checkSum(int[] nums, int k, int sum, int idx){
        if(idx==nums.length){
            if(sum==k){
                return true;
            }
            return false;
        }
        boolean left = checkSum(nums, k, sum+nums[idx], idx+1);
        boolean right = checkSum(nums, k, sum, idx+1);
        return left||right;
    }

    public static void main(String[] args) {
        int[] nums = {4,9,5,2,1};
        int k = 10;
        boolean ans = checkSubsequenceSum(nums, k);
        System.out.println(ans);
    }
}
