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


int n =sc.nextInt();
while(n>0){
    int reversedigit =n%10;
    System.out.print(reversedigit);
    n/=10;
}
System.out.println();
    }
};