public class Q11PaintersPartition {
    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        int[] C = {1,10};
        long low = 0, high = 0;
        
        for (int len : C) {
            low = Math.max(low, len); // max board
            high += len;              // total length
        }

        long ans = high;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (canPaint(C, A, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // multiply with B and take modulo
        System.out.println( (int)((ans * B) % 10000003));
    }

    private static boolean canPaint(int[] C, int A, long maxLen) {
        int painters = 1;
        long curr = 0;

        for (int len : C) {
            if (curr + len > maxLen) {
                painters++;
                curr = len;
            } else {
                curr += len;
            }
        }

        return painters <= A;
    }
}