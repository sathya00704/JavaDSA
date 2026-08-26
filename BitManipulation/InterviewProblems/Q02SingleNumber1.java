public class Q02SingleNumber1 {
    public static int singleNumber(int[] nums) {
        int c=0;
        for(int i: nums){
            c=c^i;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,2,1,2,1};
        System.out.println(singleNumber(nums));
    }
}
