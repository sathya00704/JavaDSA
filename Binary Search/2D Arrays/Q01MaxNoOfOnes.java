public class Q01MaxNoOfOnes{
    public static void main(String[] args){
        int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        int n = 3, m = 3;
        System.out.println(RowCnt(matrix, n, m));
    }

    public static int RowCnt(int[][] matrix, int n, int m){
        int maxcnt=0;
        int index=-1;
        for(int i=0;i<n;i++){
            int cnt = m - lowerbound(matrix[i], m, 1);
            if(cnt > maxcnt){
                maxcnt = cnt;
                index = i;
            }
        }
        return index;
    }

    public static int lowerbound(int[] matrix, int n, int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid] >= x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}