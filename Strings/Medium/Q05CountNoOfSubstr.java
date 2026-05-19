import java.util.HashMap;

public class Q05CountNoOfSubstr{
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        int ans = atMostKDistinct(s, k) - atMostKDistinct(s, k-1);
        System.out.println(ans);
    }

    public static int atMostKDistinct(String s, int k){
        int left=0;
        int count=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
            while(hm.size() > k){
                char leftchar = s.charAt(left);
                hm.put(leftchar, hm.get(leftchar)-1);
                if(hm.get(leftchar)==0){
                    hm.remove(leftchar);
                }
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
}