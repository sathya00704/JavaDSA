public class Q03MajorityElement1 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,2,3,4,1,1,1,2,1,4,5,1};
        int n=arr.length;
        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=arr[i];
            }
            else if(ele==arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                cnt2++;
            }
        }
        if(cnt2> (n/2)){
            System.out.println(ele);
        }
        else{
            System.out.println(-1);
        }
    }
    
}
