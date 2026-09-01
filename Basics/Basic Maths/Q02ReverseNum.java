public class Q02ReverseNum {
    public static int reverseNumber(int n) {
        int rev=0,dig=0;
        while(n>0){
            dig=n%10;
            rev=(rev*10)+dig;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(554));
    }

}
