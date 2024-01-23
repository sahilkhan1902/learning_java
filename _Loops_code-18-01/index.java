/* Types of Loops
While Loops 
-while(condition){
    //do something
}
Do while Loops
For Loops
- for(condition){
   do something }*/

// While Loopsp
import java.util.*;
public class index{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // int i =0; // initialization
        // while( i<11 ){  // check the condition here
        //       System.out.println(i); // execution 
        // i++; // print
        // }

        // for(int i=1; i<5;i++){// (initIialization, condition, updation)
        //        System.out.println(i);
        // }
    //   int n =sc.nextInt();
    //   int sum =0;
    //   int i=1;
    //   while(i<=n){
    //     sum=sum+i;
    //     i++;

    //   }
    //     System.out.println("sum is " +sum);


// 4*4 star pattern using for loopz
    // for(int i=1; i<=4; i++){
    //     System.out.println("****");
    // }
    // }


// star pattern using while loop
    // int i =1;
// while(i<=4){
//     System.out.println("******");
//     i++;
// };

// reverse a no using while loop
// int n =sc.nextInt();
// int rev=0;
// while(n>0){
//     int lastdigit =n%10;
//     rev=(rev*10)  + lastdigit;
//     System.out.print(lastdigit);
//     n/=10;
// }
// System.out.println("rev");
// int n=1;
// do{
//     System.out.println("hello world");
//     n++;
// }while(n<=10);

int n =1;
while (n<=6){
    if(n == 3){
        break;
    }
    System.out.println(n);
    n++;
}
System.out.println("i am out of the loop");



while(true){
    System.out.print("Enter a number: ");
    int a = sc.nextInt();    if(a%10 == 0){
        System.out.println("Your enter no is divible by 10 and enter value is " + a);
        break;
    }
    else{
        System.out.println("Your enter no is not divible by 10, try again");

    }
}
    }
};