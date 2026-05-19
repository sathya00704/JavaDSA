public class Q07BeautyOfSubStrSum {
    public static int getCnt(int[] freq){
        int minCnt=Integer.MAX_VALUE;
        int maxCnt=0;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                minCnt=Math.min(minCnt, freq[i]);
                maxCnt=Math.max(maxCnt, freq[i]);
            }
        }
        return maxCnt-minCnt;
    }

    public static void main(String[] args){
        String s = "aabcb";
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int beauty=getCnt(freq);
                sum=sum+beauty;
            }
        }
        System.out.println(sum);
    }
}