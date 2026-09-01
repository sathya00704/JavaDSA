import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q03HighestOccrEle {
    public static int mostFrequentElement(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        int max = 0;
        int res = Integer.MAX_VALUE;
        for(Map.Entry <Integer, Integer> e: hm.entrySet()){
            int num = e.getKey();
            int freq = e.getValue();
            if(freq>max || (freq==max && num<res)){
                max=freq;
                res=num;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,4,6,3,2,5,3,4};
        System.out.println(mostFrequentElement(nums));
    }
}
