public class Q06ShipPackages {
    public static int canship(int[] weights, int mid){
        int cnt=1;
        int sum=weights[0];
        for(int i=1;i<weights.length;i++){
            if(sum + weights[i]>mid){
                cnt++;
                sum=weights[i];
            } else{
                sum+=weights[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int low=0;//stores max element
        int high=0;//stores sum of array
        for(int i:weights){
            if(i>low){
                low=i;
            }
            high+=i;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(canship(weights, mid) <= days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }
}