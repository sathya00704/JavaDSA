public class Q11MaxConscOnes {
   public static void main(String[] args) {
       int[] arr={1,0,0,1,1,1,1,0,0,1,0,1,1,0};
       int n=arr.length;
       int cnt=0;
       int maxcnt=0;
       for(int i=0;i<n;i++){
           if(arr[i]==1){
               cnt++;
           }
           else{
               cnt=0;
           }
           if(cnt>maxcnt){
               maxcnt=cnt;
           }
       }
       System.out.println(maxcnt);
   }
}
