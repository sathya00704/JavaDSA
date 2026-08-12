import java.util.*;

public class Q08CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombo(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void findCombo(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            curr.add(candidates[i]);
            findCombo(candidates, target-candidates[i], i+1, curr, ans);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 7;
        List<List<Integer>> ans = combinationSum2(candidates, target);
        System.out.println(ans);
    }
}