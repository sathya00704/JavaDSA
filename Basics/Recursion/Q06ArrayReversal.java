public class Q06ArrayReversal {
    public static int[] rev(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        a = rev(a);
        for(int i: a){
            System.out.print(i+" ");
        }
    }
}
