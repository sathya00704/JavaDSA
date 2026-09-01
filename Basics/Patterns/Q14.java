public class Q14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int k = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) k);
                k += 1;
            }
            System.out.println();
        }
    }
}
/*
A
AB
ABC
ABCD
ABCDE
*/