public class Q01CountDigitsofANum {
    public static int countDigit(int n) {
        int cnt=0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(554));
    }

}
