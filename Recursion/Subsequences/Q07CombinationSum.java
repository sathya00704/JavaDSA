import java.util.ArrayList;
import java.util.List;

public class Q07CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombo(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void findCombo(int[] candidates, int target, int idx, List<Integer> curr, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(idx==candidates.length || target<0){
            return;
        }
        curr.add(candidates[idx]);
        findCombo(candidates,target-candidates[idx],idx,curr,ans);
        curr.remove(curr.size()-1);
        findCombo(candidates,target,idx+1,curr,ans);
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = combinationSum(candidates, target);
        System.out.println(ans);
    }
}