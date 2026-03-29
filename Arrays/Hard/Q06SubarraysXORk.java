import java.util.HashMap;

public class Q06SubarraysXORk {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int n = arr.length;
        int k=6;
        int xorr=0;
        int cnt=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for(int i=0;i<n;i++){
            xorr=arr[i]^xorr;

            //I have current XOR = xorr, Which previous XOR do I need so that the subarray XOR becomes k?”
            if(hm.containsKey(xorr^k)){
                cnt=cnt+hm.get(xorr^k);
            }
            hm.put(xorr,hm.getOrDefault(xorr, 0)+1);
        }
        System.out.println(cnt);
    }
    
}
