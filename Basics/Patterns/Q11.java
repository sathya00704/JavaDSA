public class Q11 {
    public static void main(String[] args) {
        int n = 5;
        int prev = 1;
        for (int i = 1; i <= n; i++) {
            prev = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(prev + " ");
                prev = (prev == 1) ? 0 : 1;
            }
            System.out.println();
        }
    }
}
/*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/