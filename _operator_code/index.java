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
  && (Logical And) both cases should be true
  || (Logical OR) either one case should be true
  !  ((Logical Not)) if false it will turn true and vice versa
      */
      System.out.println("Logical operation using && = " + ((3>2) && (5>0))); // both case should be true so, in this case  it will return true
      System.out.println("Logical operation using && = " + ((3<2) && (5>0))); // both case should be true so it will return false
      System.out.println("Logical operation using || = " + ((3<2) || (5>0)));
      System.out.println("Logical operation using ! = " + (!(3<2) )); // this statement is false so it will return true and vice versa

      /* Assignment Operations 
      (+=, -=, *=, /=, %=)*/
      int a = 5;
int b = 3;

System.out.println("a after += b: " + (a += b)); // Compound Assignment with Addition (+=)
System.out.println("a after -= b: " + (a -= b)); // Compound Assignment with Subtraction (-=)
System.out.println("a after *= b: " + (a *= b)); // Compound Assignment with Multiplication (*=)
System.out.println("a after /= b: " + (a /= b)); // Compound Assignment with Division (/=)
System.out.println("a after %= b: " + (a %= b)); // Compound Assignment with Modulus (%=)
     }

 }