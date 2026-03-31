public class Q12MaxProdSubarray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -4, -3};
        int n = arr.length;
        int preprod=1;
        int sufprod=1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(preprod==0) preprod=1;
            if(sufprod==0) sufprod=1;
            preprod=preprod*arr[i];
            sufprod=sufprod*arr[n-i-1];

            ans = Math.max(ans, Math.max(preprod, sufprod));
            System.out.println(preprod+" "+sufprod+" "+ans);
        }
        System.out.println(ans);
    }
}