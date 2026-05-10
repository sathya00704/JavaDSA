public class Q02MaxParenthesis {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int cnt=0;
        int maxcnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
                if(cnt>maxcnt){
                    maxcnt=cnt;
                }
            }
            if(s.charAt(i)==')'){
                cnt--;
            }
        }
        System.out.println(maxcnt);
    }
}