public class Q16 {
    public static void main(String[] args) {
        int n = 5;
        int k = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) k);
            }
            k += 1;
            System.out.println();
        }
    }
}
/*
A
BB
CCC
DDDD
EEEEE
*/