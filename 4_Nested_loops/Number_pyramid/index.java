package Nested_loops.Number_pyramid;

public class index {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            //for spaces
            for( int j=1; j<=n-i;  j++){
                System.out.print(" ");
            }
            // for numbers 
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();

        }
       
    }
    
}
