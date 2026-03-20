import java.util.HashSet;

public class Q10LongestSubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2, 21, 24, 22, 23};
        int maxcnt=1;
        HashSet <Integer> hs = new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        for(int i: hs){
            if(!hs.contains(i-1)){
                int cnt=1;
                int x = i;
                while(hs.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                if(cnt>maxcnt){
                    maxcnt=cnt;
                }
            }
        }
        System.out.println(maxcnt);
    }
}

// BETTER APPROACH
// import java.util.Arrays;
// public class Q10LongestSubsequence {
//     public static void main(String[] args) {
//         int[] arr = {1, 9, 3, 10, 4, 20, 2, 21, 24, 22, 23};
//         int n=arr.length;
//         int cnt=1;
//         int maxcnt=1;
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//         for(int i=1;i<n;i++){
//             if (arr[i] == arr[i - 1]) {
//                 continue; // skip duplicates
//             }
//             if(arr[i]==arr[i-1]+1){
//                 cnt=cnt+1;
//             }
//             else{
//                 cnt=1;
//             }

//             if(cnt>maxcnt){
//                 maxcnt=cnt;
//             }
//         }
//         System.out.println(maxcnt);
//     }
// }
