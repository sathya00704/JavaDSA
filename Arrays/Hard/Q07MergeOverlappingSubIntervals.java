import java.util.*;

public class Q07MergeOverlappingSubIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int n = intervals.length;
        Arrays.sort(
            intervals,
            (a, b) -> Integer.compare(a[0], b[0])
        );
        List<List<Integer>> ans = new ArrayList<>();
        for(int[] i : intervals){
            
            if(ans.isEmpty() || ans.get(ans.size() - 1).get(1) < i[0]){
                ans.add(Arrays.asList(i[0], i[1]));
            }
            else{
                int last = ans.size() - 1;
                int maxEnd = Math.max(
                    ans.get(last).get(1), i[1]
                );
                ans.get(last).set(1, maxEnd);
            }
        }
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }
        for(int[] i: res){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}