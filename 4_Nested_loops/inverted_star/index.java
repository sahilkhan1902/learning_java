package Nested_loops.inverted_star;

public class index {
    public static void main (String args []){
        //  star inverted pattern
        int n =4;
        for(int i =1; i<=n; i++){
            for(int star=1; star<=n-i+1; star++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
