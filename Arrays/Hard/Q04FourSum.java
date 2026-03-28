import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q04FourSum{
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        int n = nums.length;
        int target=0;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum>target){
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        List <Integer> al = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        res.add(al);
                        while(k<l && nums[k]==nums[k+1]) k++;
                        while(k<l && nums[l]==nums[l-1]) l--;
                        k++;
                        l--;
                    }
                }
            }
        }
        System.out.println(res);
    }
}