public class Q02NthRoot{
    public static void main(String[] args) {
        int m=27;
        int n=3;
        int low=1;
        int high=m;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            long temp = 1;
            for (int i = 0; i < n; i++) {
                temp *= mid;
                if (temp > m) break;
            }
            if(temp == m){
                ans=mid;
                break;
            }
            else if(temp>m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}