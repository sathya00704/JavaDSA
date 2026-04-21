class Q05SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        int n = nums.length;
        if(n>threshold) System.out.println(-1);

        int low=1;
        int high=0;
        for(int i: nums){
            if(i>high){
                high=i;
            }
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(div(nums, mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }

    public static int div(int[] arr, int mid){
        int sum=0;
        for(int i: arr){
            sum += Math.ceil((double) i / mid);
        }
        return sum;
    }
}