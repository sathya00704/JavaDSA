//BRUTE FORCE SOLUTION
public class Q10CountInversions {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 3, 5};
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
