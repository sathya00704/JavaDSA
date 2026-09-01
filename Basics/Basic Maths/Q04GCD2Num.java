public class Q04GCD2Num {
    public static void main(String[] args) {
        int n1=16,n2=4;
        if(n1<n2){
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        for(int i=n2;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
