public class Q01MinNoOfBitsFlip {
    public static int minBitFlips(int start, int goal) {
        int comp = start ^ goal;
        int cnt=0;
        while(comp>0){
            comp = comp&(comp-1);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(minBitFlips(10, 7));
    }
}