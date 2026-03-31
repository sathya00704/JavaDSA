//BRUTE FORCE SOLUTION
public class Q11ReversePairs {
    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 2, 7};
        //int[] arr = {5,4,4,3,3};
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]> 2*arr[j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
