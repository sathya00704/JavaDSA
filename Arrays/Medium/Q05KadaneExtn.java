public class Q05KadaneExtn {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -7, 2, 10, 4};
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int left=-1, right=-1;
        int start=0;
        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
            }
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
                left=start;
                right=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
        System.out.print("Elements: ");
        for(int i=left;i<=right;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
