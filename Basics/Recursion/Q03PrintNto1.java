public class Q03PrintNto1 {
    public static void printN(int cnt, int n){
        if(n<cnt){
            return;
        }
        printN(cnt+1,n);
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        printN(1,10);
    }
}
