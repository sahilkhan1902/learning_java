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

         // ----- it will check income tax on given income by taking input from the user
        // int income = sc.nextInt();
       
        //  if(income<500000){
        //     System.out.println("0% tax will be applicable on your income = " +income); //it will check wthe conditon and return the print string
        //  }
        // else if(income>500000 && income<=1000000){
        //     System.out.println("20%  tax will be applicable on your income = " +income) ;
        //     System.out.println("And your tax will be = " +income*0.2 + "Rs");
        // }
        // else{
        //      System.out.println("30%  tax will be applicable on your income = " +income) ;
        //        System.out.println("And your tax will be = " +income*0.3 + "Rs");
        // }
        

        // ---- it will check the which no among a, b and c are greater
       /* int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A>B && A>C){
            System.out.println(" A is greates with value = " + A);
        }
        else if(B>C){
            System.out.println(" B is greates with value = " + B);
        }
        else{
            System.out.println(" C is greates with value = " + C);
        }*/

        //--- terniary operator
    //     int A =sc.nextInt();
    //   System.out.println(A>10 ?"red": "blue");

    //-- using switch statement
    // int number =2;
    // switch(number){
    //     case 1 : System.out.println("aam");
    //       break;
    //     case 2 : System.out.println("naam");
    //       break;
    //     case 3 : System.out.println("kaam");
    //       break;
    // }

    // --- making calculator
    int num1 = sc.nextInt();
    System.out.println("Entered num1 = " + num1);
    int num2 = sc.nextInt();
    System.out.println("Entered num1 = " + num2);
    char operate = sc.next().charAt(0);
      System.out.println("choose operator is = " + operate);

      switch(operate){
        case '+' : System.out.println("the addition by adding num1 and num2 = "+ (num1 + num2));
        break;
        case '-' : System.out.println("the subtraction by minusing num1 and num2 = "+ (num1 - num2));
        break;
        case '*' : System.out.println("the multiple by multiplying num1 and num2 = "+ (num1 * num2));
        break;
        case '/' : System.out.println("the division of num1 and num2 = "+ (num1 / num2));
        break;
      }



    }
}