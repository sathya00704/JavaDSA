public class Q05MatrixMedian {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 9},
            {2, 5, 6},
            {3, 7, 8}
        };
        int rows=matrix.length;
        int cols=matrix[0].length;
        int low=matrix[0][0];
        int high=matrix[0][cols-1];
        for(int i=1;i<rows;i++){
            low=Math.min(low,matrix[i][0]);
            high=Math.max(high,matrix[i][cols-1]);
        }
        while(low<high){
            int mid=(low+high)/2;
            int cnt=0;
            for(int i=0;i<rows;i++){
                cnt+=cntLessEq(matrix[i],mid);
            }
            if(cnt<(rows*cols+1)/2){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        System.out.println(low);
    }

    public static int cntLessEq(int[] row, int mid){
        int low=0;
        int high=row.length;
        while(low<high){
            int m=(low+high)/2;
            if(row[m]<=mid){
                low=m+1;
            }
            else{
                high=m;
            }
        }
        return low;
    }
}
