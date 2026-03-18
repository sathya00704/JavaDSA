public class Q06StockBestTime{
    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 8, 11, 9};
        int n = arr.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int profit=0;
            if(arr[i]<min){
                min=arr[i];
            }
            profit=arr[i]-min;
            if(max<profit){
                max=profit;
            }
        }
        System.out.println(max);
    }
}

//BRUTE FORCE APPROACH
// public class Q06StockBestTime{
//     public static void main(String[] args) {
//         int[] arr = {10, 7, 5, 8, 11, 9};
//         int n = arr.length;
//         int max=0;
//         for(int i=0;i<n;i++){
//             int profit=0;
//             for(int j=i+1;j<n;j++){
//                 profit=arr[j]-arr[i];
//                 if(profit>max){
//                     max=profit;
//                 }
//             }
//         }
//         System.out.println(max);
//     }
// }