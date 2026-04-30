public class Q02FindTargetIn2DArr {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        int n = matrix.length;
        int m = matrix[0].length;
        int low=0;
        int high=m*n - 1;
        while(low<=high){
            int mid=low + (high - low) / 2;
            int x=mid/m;
            int y=mid%m;
            if(matrix[x][y]==target){
                System.out.println(true);
                return;
            }
            else if(matrix[x][y]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(false);
    }
}