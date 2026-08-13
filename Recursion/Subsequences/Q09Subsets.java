import java.util.*;

public class Q09Subsets {
    public static List<Integer> subsetSums(int[] nums) {
        List<Integer> curr = new ArrayList<>(0);
        findSum(nums, 0, 0, curr);
        return curr;
    }

    public static void findSum(int[] nums, int idx, int sum, List<Integer> curr){
        if(nums.length==idx){
            curr.add(sum);
            return;
        }
        findSum(nums, idx+1, sum, curr);
        findSum(nums, idx+1, sum+nums[idx], curr);
    }
    public static void main(String[] args) {
        int[] nums={5,2,1};
        List<Integer> ans = subsetSums(nums);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}