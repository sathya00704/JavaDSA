public class Q04KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -7, -2, -10, -4};
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
