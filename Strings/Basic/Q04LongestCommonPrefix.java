import java.util.Arrays;

public class Q04LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
        StringBuilder ns = new StringBuilder();
        String f = strs[0];
        String l = strs[strs.length-1];
        for(int i=0;i<Math.min(f.length(), l.length());i++){
            if(f.charAt(i)!=l.charAt(i)){
                System.out.println(ns.toString());
                return;
            }
            ns.append(f.charAt(i));
        }
        System.out.println(ns.toString());
    }
}