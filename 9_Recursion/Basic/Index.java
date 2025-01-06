public class index {
    public static void printDec(int n){
        if(n==1){
        System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
        }
    public static int printFact(int n){
        if (n == 0){
            return 1;
        }
       int fnm1 = printFact(n-1);
       System.out.println();
       int fnm2 = n* printFact(n-1);
       return fnm2;
    }
    public static int calSum (int n){
        if(n ==1 ){
            return 1;
        }
        return n + calSum(n-1);
    }
    public static int printFibo (int n){
        if (n ==0 ){
            return 0;
        }
        if (n ==1 ){
            return 1;
        }
        return  printFibo(n-1) + printFibo(n-2);
    }
    public static boolean isSorted(int arr [], int i){
        if (arr[i] == arr.length-1){
            return true;
        }
        if (arr[i]> arr[i+1]){
            return false;
        }
         return isSorted(arr, i+1);
    }
    public static int RetIndex(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        } 
            return RetIndex(arr, key,  i+1);
        
    }
    public static void main (String[]args){
     int arr[] = {1,6,4,5,6};
        int n =5;
        // printInc(n);
        // printDec(n);
        // System.out.println(printFibo(n));
        // System.out.println(isSorted(arr, 0));
        System.out.println(RetIndex(arr,6,0));
    }
}

