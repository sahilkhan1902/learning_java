// take an array input from the user and search for given number and print the index

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num [] = new int[size];

        //for taking input
        for (int i = 0; i <size; i++) {
            num[i]= sc.nextInt();
        }
        int x = sc.nextInt();

        // for output
        for (int i = 0; i < num.length; i++) {
            if(num[i] == x){
                System.out.println("the index of given no " + x + " is = "+ i );
            }
        }
    }
    
}
