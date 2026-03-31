public class Q09MissingRepeating{
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4,6,7,5};
        int n = arr.length;
        int arrsum=0;
        int sumnat=(n*(n+1))/2;
        int sumsqnat = (n*(n+1)*(2*n + 1))/6;
        int arrsqsum=0; //Use long if required and change everywhere accordingly
        for(int i=0;i<n;i++){
            arrsum+=arr[i];
            arrsqsum+=Math.pow(arr[i], 2);
        }
        int val1=arrsum-sumnat;
        int val2=arrsqsum-sumsqnat;
        val2=val2/val1;
        int repeating = (val1+val2) / 2;
        int missing = repeating - val1;
        System.out.println(repeating+" "+missing);
    }
}


// NOT OPTIMAL APPROACH
// import java.util.Arrays;

// public class Q09MissingRepeating{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 6, 7, 5, 7};
//         int n = arr.length;
//         Arrays.sort(arr);
//         int[] ans = {0,0};
//         int index=-1;
//         int sum=0;
//         for(int i=0;i<n-1;i++){
//             if(arr[i]==arr[i+1]){
//                 ans[0]=arr[i];
//                 index=i;
//             }
//             sum=sum+arr[i];
//         }
//         sum=sum+arr[n-1];
//         int tot = (n*(n+1))/2;
//         ans[1]=tot+arr[index]-sum;
//         System.out.println(Arrays.toString(ans));
//     }
// }