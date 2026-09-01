import java.util.*;

public class Q06Divisors {
    public static void main(String[] args) {
        int n=144;
        List <Integer> al = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                al.add(i);
                if(i!= n/i){
                    al.add(n/i);
                }
            }
            
        }
        System.out.print(al);
    }
}
