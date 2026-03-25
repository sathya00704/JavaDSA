import java.util.ArrayList;
import java.util.List;

public class Q13SpiralTraversal {
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> al = new ArrayList<Integer>();
        int top=0,bottom=matrix.length-1;
        int left=0, right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                al.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                al.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    al.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(al);
    }
}
