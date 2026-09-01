public class Q02Print1toN {
    public static void printN(int cnt, int n){
        if(n<cnt){
            return;
        }
        System.out.println(cnt);
        printN(cnt+1,n);
    }
    public static void main(String[] args) {
        printN(1,10);
    }
}
