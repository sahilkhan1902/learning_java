package Nested_loops.inverted180star;

public class index {
    public static void main (String args []){
        int n =4;
        for(int i =1; i<=n; i++){
            // for space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // for star print 
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
