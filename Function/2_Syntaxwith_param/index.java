/*Syntax with Parameters
  returnType name (type param1, type param2){
  //body
  return statement;
  }
 */
import java.util.*;
public class index {
    public static int calculateSum(int a, int b){
       int sum = a+b;
       return sum;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();
   int sum = calculateSum(a, b);
    System.out.println("sum of a and b = " + sum);

   } 
}
