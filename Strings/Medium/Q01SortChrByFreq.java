import java.util.*;

public class Q01SortChrByFreq {
    public static void main(String[] args) {
        String s = "tree";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c: s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Character>[] bucket = new ArrayList[s.length()+1];
        for(char c: hm.keySet()){
            int freq = hm.get(c);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(c);
        }
        StringBuilder res = new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char c: bucket[i]){
                    for(int j=0;j<i;j++){
                        res.append(c);
                    }
                }
            }
        }
        System.out.println(res.toString());
    }
}