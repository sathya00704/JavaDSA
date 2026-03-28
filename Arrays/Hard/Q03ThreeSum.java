import java.util.*;

public class Q03ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;

            //To avoid using the same element
            if(i>0 && nums[i]==nums[i-1]) continue;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    List<Integer> al = Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(al);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        System.out.println(res);
    }
}

// BRUTE FORCE APPROACH
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;

// public class Q03ThreeSum {
//     public static void main(String[] args) {
//         int[] nums = {-1,0,1,2,-1,-4};
//         int n=nums.length;
//         HashSet <ArrayList<Integer>> hs = new HashSet<>();
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     int sum = nums[i] + nums[j] + nums[k];
//                     if(sum==0){
//                         if(i!=j && j!=k && i!=k){
//                             ArrayList<Integer> temp = new ArrayList<>();
//                             temp.add(nums[i]);
//                             temp.add(nums[j]);
//                             temp.add(nums[k]);
//                             Collections.sort(temp);
//                             hs.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         System.out.println(hs);
//     }
// }
