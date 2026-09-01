public class Q18 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int k = 65;
            k += (n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print((char) k + " ");
                k += 1;
            }
            System.out.println();
        }
    }
}
/*
E 
D E 
C D E 
B C D E 
A B C D E
*/