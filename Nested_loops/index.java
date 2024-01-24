package Nested_loops;

public class index {
    public static void main( String args []){
        // pattern using nested loops
        // for(int i =1; i<=4; i++){
        //     for(int star=0; star<=i; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // star inverted pattern
        // int n =4;
        // for(int i =1; i<=n; i++){
        //     for(int star=1; star<=n-i+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // num pyramid pattern
        // int n =4;
        // for(int line =1; line<=n; line++){
        //     for(int num=1; num<=line; num++){
        //         System.out.print(num);
        //     }
        //     System.out.println("");
        // }
  
        // print charted pattern
        int n =4;
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int chars=1; chars<=i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
    
}
