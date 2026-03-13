public class Q10MissingNumber {
   public static void main(String[] args) {
       int[] arr = {1,6,4,3,2};
       int n=arr.length;
       int sum=0;
       for(int i=0;i<n;i++){
           sum=sum+arr[i];
       }
       n=n+1;
       int tot = (n*(n+1))/2;
       System.out.println(tot-sum);
   }
}
