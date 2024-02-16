package Nested_loops.num_pattern;

public class index {
    public static void main (String args []){
         int n =6;
        for(int line =1; line<=n; line++){
            for(int num=1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println("");
        }
    }

}