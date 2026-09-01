import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02ArrayEleFreq {
    public static List<List<Integer>> countFrequencies(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        List<List<Integer>> result = new ArrayList<>();


        // Convert map to list of pairs
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,4,6,3,2,5,3,4};
        List<List<Integer>> ans = countFrequencies(nums);
        System.out.println(ans);
    }
}
