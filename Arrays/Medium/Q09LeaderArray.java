import java.util.*;

public class Q09LeaderArray{
    public static void main(String[] args) {
        int[] arr = {-3, 4, 5, 1, -4, -5};
        int n = arr.length;
        List<Integer> al = new ArrayList<>();
        int max=arr[n-1];
        al.add(max);
        for(int i=n-2;i>=0;i--){
            if(max<arr[i]){
                al.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(al);
        System.out.println(al);
    }
}