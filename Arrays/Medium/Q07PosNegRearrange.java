import java.util.Arrays;

public class Q07PosNegRearrange {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -1, -3, -4};
        int n=arr.length;
        int[] temp = new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                temp[pos]=arr[i];
                pos+=2;
            }
            else{
                temp[neg]=arr[i];
                neg+=2;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
