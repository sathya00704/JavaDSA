public class Q05FloorCeil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int floorx=-1;
        int ceilx=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                ceilx=arr[mid];
                floorx=arr[mid];
                break;
            }
            else if(arr[mid]>x){
                ceilx=arr[mid];
                high=mid-1;
            }
            else{
                floorx=arr[mid];
                low=mid+1;
            }
        }
        System.out.println("Floor="+floorx+" "+"Ceil="+ceilx);
    }
    
}
