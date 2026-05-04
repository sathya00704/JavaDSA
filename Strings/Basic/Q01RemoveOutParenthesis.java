public class Q01RemoveOutParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        int cnt=0;
        StringBuilder ns = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if (a=='('){
                if(cnt>0){
                    ns.append('(');
                }
                cnt+=1;
            }
            else{
                cnt-=1;
                if(cnt>0){
                    ns.append(')');
                }
            }
        }
        System.out.println(ns.toString());
    }
}