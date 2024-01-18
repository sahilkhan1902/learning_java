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
public class index{
    public static void main (String args[]){
        // int i =0; // initialization
        // while( i<11 ){  // check the condition here
        //       System.out.println(i); // execution 
        // i++; // print
        // }

        // for(int i=1; i<5;i++){// (initIialization, condition, updation)
        //        System.out.println(i);
        // }
      int n;
      int sum =0;
      int i=1;
      while(i<=5){
        sum=sum+i;
        i++;

      }
        System.out.println("sum is " +sum);
    }
}