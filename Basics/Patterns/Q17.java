public class Q17 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int k = 64;
            String a = " ".repeat(n - i);
            System.out.print(a);
            for (int j = 1; j <= i; j++) {
                k += 1;
                System.out.print((char) k);
            }
            for (int j = i; j > 1; j--) {
                k -= 1;
                System.out.print((char) k);
            }
            System.out.println();
        }
    }
}
/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/