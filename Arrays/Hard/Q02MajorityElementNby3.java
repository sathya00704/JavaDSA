import java.util.*;

public class Q02MajorityElementNby3 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int n=nums.length;
        int c1=0,c2=0,e1=Integer.MIN_VALUE, e2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(c1==0 && nums[i]!=e2){
                c1++;
                e1=nums[i];
            }
            else if(c2==0 && nums[i]!=e1){
                c2++;
                e2=nums[i];
            }
            else if(e1==nums[i]){
                c1++;
            }
            else if(e2==nums[i]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        int maj=n/3;
        for(int i=0;i<n;i++){
            if(nums[i]==e1){
                c1++;
            }
            else if(nums[i]==e2){
                c2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        if(c1>maj){
            res.add(e1);
        }
        if(c2>maj){
            res.add(e2);
        }
        System.out.println(res);
    }
}