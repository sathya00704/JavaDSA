public class Q03RomanToInt {
    public static int intval(char r){
        if(r=='I') return 1;
        if(r=='V') return 5;
        if(r=='X') return 10;
        if(r=='L') return 50;
        if(r=='C') return 100;
        if(r=='D') return 500;
        if(r=='M') return 1000;
        return 0;
    }

    public static void main(String[] args) {
        String s = "LVIII";
        int res=0;
        int i=0;
        while(i<s.length()){
            int s1 = intval(s.charAt(i));
            if(i+1 < s.length()){
                int s2 = intval(s.charAt(i+1));
                if(s1 >= s2){
                    res=res+s1;
                    i=i+1;
                }
                else{
                    res=res+s2-s1;
                    i=i+2;
                }
            }
            else{
                res=res+s1;
                i=i+1;
            }
        }
        System.out.println(res);   
    }
}