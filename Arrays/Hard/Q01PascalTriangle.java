import java.util.ArrayList;
import java.util.List;

public class Q01PascalTriangle{
    public static List<Integer> generateRows(int row){
        List <Integer> al = new ArrayList<>();
        al.add(1);
        int ans=1;
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            al.add(ans);
        }
        return al;
    }

    public static void main(String[] args) {
        int numRows=6;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<numRows+1;i++){
            res.add(generateRows(i));
        }
        for(List<Integer> l : res){
            for(int j: l){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}