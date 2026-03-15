//Calculating the longest subarray containing only positives with a Sum K.
//OPTIMAL APPROACH
public class Q13LongestSubarray{
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
        int n = arr.length;
        int k = 15;
        int left = 0;
        int right = 0;
        int sum = 0;
        int longcnt = 0;
        while(right<n){
            sum=sum+arr[right];
            while(sum>k){
                sum=sum-arr[left];
                left++;
            }
            if(sum==k && right-left+1 > longcnt){
                longcnt = right-left+1;
            }
            right++;
            System.out.println(sum+" "+left+" "+right+" "+longcnt);
        }
        System.out.println(longcnt);
    }
}


// BRUTE FORCE APPROACH
// public class Q13LongestSubarray{
//     public static void main(String[] args) {
//         int[] arr = {10, 5, 2, 7, 1, 9};
//         int n = arr.length;
//         int k=15;
//         int longcnt=0;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             int cnt=0;
//             for(int j=i;j<n;j++){
//                 sum=sum+arr[j];
//                 cnt++;
//                 if(sum==k && longcnt<cnt){
//                     longcnt=cnt;
//                 }
//             }
//         }
//         System.out.println(longcnt);
//     }
// }