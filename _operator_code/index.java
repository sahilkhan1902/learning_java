import java.util.*;

//Operators in Java


/*types of operator
-Arithmetic Operator
    Binary (+ - / * %) and Unary ( ++, --)
-Realational Operator
-Logical Operator
-Bitwise Operator
-Assignment Operator
*/
//  calculating the area of a circle
 public class index{
      public static void main(String  []args) {

    // Arithmetic Operator
     int num1 =50;
     int num2 =625;
     System.out.println("Add = " + (num2+num1));
     System.out.println("Subtract = " + (num2-num1));
     System.out.println("Multiply = " + (num2*num1));
     System.out.println("Divide = " + (num2/num1));

     /*Unary Operator
     pre or post (inremet or decrement)
     ++a pre increment a++ post increment or vice versa for decrement
      */
      System.out.println("Unary pre Increment = " + (++num1));
      System.out.println("Unary post Increment = " + (num1++));
      System.out.println("Unary pre Decrement = " + (--num1));
      System.out.println("Unary post Decrement = " + (num1--));
     
     /*Relational Operator
   == equal
   != not equal
   > Less
   < Great
   <= 
   >=
      */

        System.out.println("Relational operation using equal = " + (num1 == num2));
        System.out.println("Relational operation using not euqal = " + (num1 != num2));
        System.out.println("Relational operation using Less = " + (num1 > num2));
        System.out.println("Relational operation using greater " + (num1 < num2));
        System.out.println("Relational operation using less than equal to =  " + (num1 >= num2));
        System.out.println("Relational operation using Great than equal to = " + (num1 <= num2));

          /*Logical Operator
  && (Logical And)
  || (Logical OR)
  !  ((Logical Not))
      */
     }

 }