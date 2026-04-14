public class Q03BananaQn {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        int low = 1;
        int high = 0;
        // find max pile
        for (int i : piles) {
            high = Math.max(high, i);
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid; // ceil division
            }
            if (totalHours <= h) {
                ans = mid;
                high = mid - 1; // try smaller k
            } else {
                low = mid + 1; // need bigger k
            }
        }
        System.out.println(ans);
    }
}