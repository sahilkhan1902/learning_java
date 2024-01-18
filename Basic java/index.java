import java.util.*;

// calculating the area of a circle
// public class Index{
//       public static void main(String  []args) {
//        Scanner sc = new Scanner(System.in);
     
//        float radius = sc.nextFloat();
//        float area = 3.14f * radius * radius;
//        System.out.print(area);
        
//     }

// }
    //    int a = sc.nextInt();
    //    int b = sc.nextInt();
    //    int sum = a * b;
    //    System.out.print(sum);
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.print(name);


    //  int a =5;
    //  System.out.println("the value of a is " +  a);
    //  String name = "Tony Stark";
    //  System.out.println("the name is " +  name);





// using character to integer
// public class Index{
//       public static void main(String  []args) {
//        char a = 's';
//          int b = a; // in this case it will work
//          //   char conversion to number work because every char hold some associate value 
//        System.out.print(b);
        
//     }

// }

    // type casting in java
// public class Index{
//       public static void main(String  []args) {
//        Scanner sc = new Scanner(System.in);
     
//        float number = 25.23f;
//     //    int a = number;   -- in this it will throw error
//        int a = (int) number; // in this case it will work
//        System.out.print(a);
        
//     }

// }

// Type conversion also knows as widening/implicit type
/* conversion happens when 
- type compatible
- destination type > source type
byte -> short -> int -> float -> long -> short*/
// public class Index{
//       public static void main(String  []args) {
//        int a = 25;
//          long b = a; 
//         System.out.print(b);
        
//     }

// }

// Type promotion in Java
// if there is an expression java automatically promotes byte, short or long to int value
// if one expression is long, float or double the whole expression is promotes to long, float or long respectively
public class Index{
      public static void main(String  []args) {

    // ---- for first condition
    //    char a = 'a';
    //      char b ='b'; 
        //  char c = a-b; -- it will not work as c is char type and after adding in expression a-b become interger type
        // System.out.println(b-a);

        // short a = 25;
        // byte b = 2;
        // char c = 'c';
        // byte = a+b+c; //if will throw an error because after express it become into the int
        

        //---- for second case----
        // int a =10;  // in this scenario max data type is double so all value will be convert to double
        // float b =20-23f;
        // long c = 26;
        // double d = 40;
        // double e = a+b+c+d;
        // System.out.print(e);


        byte b = 10;
        // byte c = b*2;
         byte c = (byte) (b*2);  // where as  -- in this case work because explicitly we redeclared the data typw
        System.out.print(c); // here it will throw an error because after expr. it will become an int
       
       
    }

}