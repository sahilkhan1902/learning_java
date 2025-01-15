
public class index {
    public static void mergeSort(int arr[], int low, int high){
         int mid = low + (high-low)/2;
         if(low>=high) return;
         mergeSort(arr, low, mid);
         mergeSort(arr, mid+1, high);
         merge(arr, low, high, mid);
    }
    public static void merge(int arr[], int low, int high, int mid){
        int temp [] = new int [high-low+1]; 
         int left = low;
         int right = mid+1;
         int k =0;
         while(left<= mid && right <= high){
            if(arr[left]> arr[right]){
                temp[k]= arr[left];
                left++;
            } else{
                temp[k]= arr[right];
                right++;
            }
            k++;
         }
         while (left <= mid){
            temp[k] = arr[left];
            k++;
         };
         while (right <= high){
            temp[k] = arr[right];
            k++;
         };
         for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    int arr [] = {3,6,7,9,4,6};
    mergeSort(arr, 0, arr.length-1);
    printArr(arr);
   } 
}
