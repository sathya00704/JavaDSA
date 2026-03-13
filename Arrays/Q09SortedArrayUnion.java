import java.util.*;

public class Q09SortedArrayUnion {
   public static void main(String[] args) {
       int[] arr1 = {1,5,6,7,10};
       int[] arr2 = {2,3,4,8};
       int n1=arr1.length;
       int n2=arr2.length;
       ArrayList<Integer> al = new ArrayList<>();
       int i=0;
       int j=0;
       while(i<n1 && j<n2){
           if(arr1[i]>arr2[j]){
               if(al.isEmpty() || al.get(al.size()-1) != arr2[j]){
                   al.add(arr2[j]);
                   j++;
               }
           }
           else if(arr1[i]<arr2[j]){
               if(al.isEmpty() || al.get(al.size()-1) != arr1[i]){
                   al.add(arr1[i]);
                   i++;
               }
           }
           else{
               if(al.isEmpty() || al.get(al.size()-1) != arr1[i]){
                   al.add(arr1[i]);
                   i++;
                   j++;
               }
           }
       }
       while(i<n1){
           if(al.isEmpty() || al.get(al.size()-1) != arr1[i]){
               al.add(arr1[i]);
               i++;
           }
       }
       while(j<n2){
           if(al.isEmpty() || al.get(al.size()-1) != arr2[j]){
               al.add(arr2[j]);
               j++;
           }
       }
       System.out.println(al);
   }
}
