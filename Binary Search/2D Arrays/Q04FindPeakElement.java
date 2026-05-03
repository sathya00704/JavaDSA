public class Q04FindPeakElement {
    public static int maxElement(int[][] mat, int col){
        int n=mat.length;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index=i;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int[][] mat = {{1,4},{3,2}};
        int n = mat.length;
        int m = mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row=maxElement(mat, mid);
            int left=mid-1 >=0 ? mat[row][mid-1]:Integer.MIN_VALUE;
            int right=mid+1<m?mat[row][mid+1]:Integer.MIN_VALUE;
            if(mat[row][mid] > left && mat[row][mid] > right){
                System.out.println(mid+" "+row);
                return;
            }
            else if (left>mat[row][mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(-1+" "+-1);
    }
}