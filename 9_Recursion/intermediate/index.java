// package 9_Recursion.intermediate;

public class index {
    public static int tilingProblen(int n){
        if( n == 0 || n ==1){
            return 1;
        }
        return tilingProblen(n-1)+ tilingProblen(n-2);
    }
    public static void main(String[] args) {
      System.out.println( tilingProblen(3));
       
    }
    
}
