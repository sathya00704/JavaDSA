public class Q09 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String a = " ".repeat(n - i);
            System.out.print(a);
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            String a = " ".repeat(n - i);
            System.out.print(a);
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/