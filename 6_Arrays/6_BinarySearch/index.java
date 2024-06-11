

public class index {
    public static int binarySearch(int number [], int key){
        int start =0;
        int end = number.length-1;
        while(start <= end){
            int mid = (start + end )/2;

            //comparisons
            if(number[mid] == key){
                return mid;
            }
            if(number[mid]< key){ // right half
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number [] = {2,3,5,6,7,9,10,12};
        int key = 7;
        System.out.println("The number fount at index = " + binarySearch(number, key));
    }
    
}
