public class Q05Armstrong {
     public static void main(String[] args) {
        int n=153;
        int cntdig=String.valueOf(n).length();
        int temp=n;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+(int)Math.pow(dig,cntdig);
            n=n/10;
        }
        if(temp==sum) System.out.println("Armstrong");
        else System.out.println("Not armstrong");
    }
}
