public class Q01AtoiUsingRecursion {
    public static int myAtoi(String s) {
        int n=s.length();
        int i=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i==n) return 0;

        int sign=1;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            if(s.charAt(i)=='-')
                sign=-1;
            i++;
        }
        return func(s,i,sign,0);
    }

    private static int func(String s, int idx, int sign, long num){
        if (idx >= s.length() || !Character.isDigit(s.charAt(idx))) {
            long ans = sign * num;
            if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return (int) ans;
        }

        int digit = s.charAt(idx) - '0';

        num = num * 10 + digit;

        if (sign == 1 && num > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (sign == -1 && -num < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return func(s, idx + 1, sign, num);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-21474836482"));
    }
}