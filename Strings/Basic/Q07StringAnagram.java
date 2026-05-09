public class Q07StringAnagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        if(s.length() != t.length()){
            System.out.println(false);
            return;
        }
        int[] c = new int[26];

        for(int i=0;i<s.length();i++){
            c[s.charAt(i) - 'a']++;
            c[t.charAt(i) - 'a']--;
        }
        
        for(int k: c){
            if(k!=0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}