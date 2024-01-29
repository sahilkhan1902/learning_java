package Nested_loops.Butterfly_pattern;

public class index {
    public static void main(String[] args) {
         // for upper half
         int n =4;
         for(int i=1;i<=n; i++){
            // for first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // for space 
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // for 2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }

         // for lower half
         for(int i=n;i>=1; i--){
            // for first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // for space 
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // for 2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
    
}
