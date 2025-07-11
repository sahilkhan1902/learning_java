
public class index {
    public static int search (int arr[], int si, int tar,int ei){
        int mid = si+(ei-si)/2;
        if (si> ei) return -1;
        if (arr[mid] ==tar){
            return mid;
        }
        // case 1 in line 1
        if(arr[si]<= arr[mid]){
            //case a: left
            if(arr[si]<= tar &&tar<= arr[mid]){
            return search(arr, si, tar, mid-1);
            } else{
            //case b: right
            return search(arr, mid+1, tar, ei); 
            } 
        } else{  // case 1 in line 2
            //case c: right
            if(arr[mid]<= tar && tar<= arr[ei]){
                    return search(arr, mid+1, tar, ei);
                } else{
            //case d: right
                    return search(arr, si , tar, mid-1);
                }
            }
        }
    
    public static void main(String[] args) {
        int arr []= {4,5,6,7,0,1,2};
        int tar = 0;
        System.out.println(search( arr, 0,tar, arr.length-1));
    }
}
