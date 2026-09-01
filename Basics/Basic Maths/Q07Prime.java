import java.util.*;
public class Q07Prime {
    public static void main(String[] args) {
        int n=13;
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if(i!= n/i){
                    cnt++;
                }
            }
        }
        if(cnt == 2) System.out.print("prime");
        else System.out.print("not prime");
    }
}
