class Q08Divide2Nos {
    public static int divide(int dividend, int divisor) {
        //your code goes here
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long)dividend);
        long b = Math.abs((long) divisor);
        
        long quo=0;
        while(a>=b){
            long curr=b;
            long multiple=1;
            while(curr+curr <= a){
                curr=curr<<1;
                multiple=multiple<<1;
            }
            a=a-curr;
            quo = quo+multiple;
        }
        if(negative){
            quo=-quo;
        }
        if(quo>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(quo<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) quo;
    }

    public static void main(String[] args) {
        int ans = divide(122, -3);
        System.out.println(ans);
    }
}