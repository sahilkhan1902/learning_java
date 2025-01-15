public class index {
    public static void mergeSort(int arr[], int low, int high){
        int mid = low + (high - low) / 2;
        if (low >= high) return;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid +1, high);
        merge(arr, low, high, mid);
    }
    public static void merge(int arr[], int low, int high, int mid){
        int temp[] = new int[high - low + 1]; 
        int left = low;
        int right = mid + 1;
        int k = 0;

        // Change the comparison to make sure we merge in ascending order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) { // Changed to ascending order comparison
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        // Copy remaining elements from the left half
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // Copy remaining elements from the right half
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy the sorted elements from temp[] back to arr[]
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    // Method to print the array
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print array elements
        }
        System.out.println();
    }

    // Main method to test Merge Sort
    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 9, 4, 6};  // Example array
        mergeSort(arr, 0, arr.length - 1);  // Sort the array using Merge Sort
        printArr(arr);  // Print the sorted array in ascending order
    }
}
