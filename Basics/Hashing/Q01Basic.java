import java.util.*;

class Q01Basic {
    public static void main(String[] args) {
        int n;
        n = 5;
        int[] arr = new int[]{4,5,2,4,2};

        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = 1;
        while (q-- != 0) {
            int number;
            number = 4;
            // fetching:
            System.out.println(hash[number]);
        }
    }
}