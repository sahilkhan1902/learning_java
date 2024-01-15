import java.util.*;
public class index{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in); //take input value from the user
        // int year = sc.nextInt();
        // int age = 19;
        // if(year>=18){
        //     System.out.println("You can vote"); it will check wthe conditon and return the print string
        // }
        // else{
        //     System.out.println("You can not vote") ;
        // }
        
        // int A = sc.nextInt(); // here take the input from the usera
       // int B = sc.nextInt(); // here take the input from the usera/

        // -- for checking the greater no between two inputs
        // if(A>B){
        //     System.out.println("A is greater than B with value = " + A); // if A is greater it will return the string with the value A get from the user
        // }
        // else{
        //      System.out.println("B is greater than A with value = " + B); // if B is greater it will return the string with the value B get from the user
        // }


        // ----- it will check wether no is even or odd
        //  int A = sc.nextInt();
        //  if(A%2==0){
        //     System.out.println("A is even with value = " +A); //it will check wthe conditon and return the print string
        // }
        // else{
        //     System.out.println("A is odd with value = " +A) ;
        // }

         // ----- it will check income tax on given income
        int income = sc.nextInt();
       
         if(income<500000){
            System.out.println("0% tax will be applicable on your income = " +income); //it will check wthe conditon and return the print string
         }
        else if(income>500000 && income<=1000000){
            System.out.println("20%  tax will be applicable on your income = " +income) ;
            System.out.println("And your tax will be = " +income*0.2 + "Rs");
        }
        else{
             System.out.println("30%  tax will be applicable on your income = " +income) ;
               System.out.println("And your tax will be = " +income*0.3 + "Rs");
        }
        


    }
}