import java.util.Arrays;

class Q08NextPermut {
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
        int brpt=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                brpt=i;
                break;
            }
        }
        if(brpt==-1){
            reverse(nums, 0, n-1);
        }
        else{
            for(int i=n-1;i>brpt;i--){
                if(nums[i]>nums[brpt]){
                    swap(nums, i, brpt);
                    break;
                }
            }
            reverse(nums, brpt+1, n-1);
            System.out.println(Arrays.toString(nums));
        }
    }
}