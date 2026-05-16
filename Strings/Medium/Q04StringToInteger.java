public class Q04StringToInteger {
    public static void main(String[] args){
        String s = "   -042";
        int i=0;
        int n=s.length();

        //Skip leading spaces
        while(i<n && s.charAt(i)==' '){
            i++;
        }

        int sign=1;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }

        int res=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(res > (Integer.MAX_VALUE - digit) / 10){
                System.out.println(sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                return;
            }
            res=res*10+digit;
            i++;
        }
        System.out.println(res*sign);
    }
}