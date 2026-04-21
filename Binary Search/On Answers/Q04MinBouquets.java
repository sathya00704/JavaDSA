public class Q04MinBouquets {
    public static boolean possible(int[] bloomDay, int days, int m, int k){
        int totBouq=0;
        int cnt=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=days){
                cnt++;
                if(cnt==k){
                    totBouq++;
                    cnt=0;
                }
            }
            else{
                cnt=0;
            }
        }
        return totBouq>=m;
    }

    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        if(m*k > bloomDay.length){
            System.out.println(-1);
            return;
        }
        int max=0,min=0; //initialised 0 assuming there will be no negative elements in the arr
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
        }
        int low = min;
        int high = max;
        int ans = -1;
        while(low<=high){
            int mid=low + (high - low) / 2;
            if(possible(bloomDay, mid, m, k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}