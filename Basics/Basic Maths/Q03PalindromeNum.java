public class Q03PalindromeNum {
    public static void main(String[] args) {
        int n=1772;
        int temp=1771;
        int rev=0,dig=0;
        while(temp>0){
            dig=temp%10;
            rev=(rev*10)+dig;
            temp=temp/10;
        }
        if(rev==n) System.out.println(true);
        else System.out.println(false);
    }
}
