import java.util.*;

public class Q03PowerSets {
    public static List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, new ArrayList<>(), nums, ans);
        return ans;
    }

    public static void backtrack(int index, List<Integer> curr, int[] nums, List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backtrack(index+1, curr, nums, ans);

        curr.remove(curr.size()-1);
        backtrack(index+1, curr, nums, ans);
    }

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        List<List<Integer>> ans = powerSet(nums);
        for(List<Integer> i: ans){
            for(Integer j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}