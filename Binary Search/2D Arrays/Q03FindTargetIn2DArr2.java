public class Q03FindTargetIn2DArr2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        int n = matrix.length;
        int m = matrix[0].length;
        int row=0;
        int col=m-1;
        while(row<n && col>=0){
            if(matrix[row][col]==target){
                System.out.println(true);
                return;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println(false);
    }
}