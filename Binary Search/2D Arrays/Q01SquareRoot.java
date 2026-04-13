public class Q01SquareRoot{
    public static void main(String[] args) {
        int n = 36;
        int low=0;
        int high=n/2;
        int ans=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(mid*mid <= n){
                ans=(int) mid;
                low=(int) mid + 1;
            }
            else{
                high=(int)mid-1;
            }
        }
        System.out.println(ans);
    }
}