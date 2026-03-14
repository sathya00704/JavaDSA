public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,6,7,3};
        int n = arr.length;
        quicksort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pIndex = partition(arr, low, high);
            quicksort(arr, low, pIndex-1);
            quicksort(arr, pIndex+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    
}
