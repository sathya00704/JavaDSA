public class Q05CountSetBits {
    public static int countSetBits(int n) {
        // Your code goes here
        int cnt=0;
        while(n>0){
            n = n&(n-1);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(5));
    }
}