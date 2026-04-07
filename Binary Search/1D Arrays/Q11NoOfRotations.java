public class Q11NoOfRotations {
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid= (low+high)/2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(low);
    }
}
