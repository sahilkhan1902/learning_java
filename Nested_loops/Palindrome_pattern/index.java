package Nested_loops.Number_pyramid;

public class index {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            //for spaces
            for( int j=1; j<=n-i;  j++){
                System.out.print(" ");
            }
            // for first half of numbers 
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
       
    }
    
}
