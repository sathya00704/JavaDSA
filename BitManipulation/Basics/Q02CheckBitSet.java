public class Q02CheckBitSet {
    public static boolean checkIthBit(int n, int i) {
        int v = 1 << i;
        int v2 = v & n;
        if(v2==0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIthBit(5,0));
    }
}
    
