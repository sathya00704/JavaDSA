public class Q06SetRightmostBit {
    public static int setRightmostUnsetBit(int n) {
        return n | (n + 1);
    }

    public static void main(String[] args) {
        System.out.println(setRightmostUnsetBit(6));
    }
}