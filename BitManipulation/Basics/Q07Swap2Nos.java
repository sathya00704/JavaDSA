public class Q07Swap2Nos {
    public static int[] swap(int a, int b) {
        a=a^b;
        b=a^b;
        a=a^b;
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        int[] ans = swap(2,3);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
