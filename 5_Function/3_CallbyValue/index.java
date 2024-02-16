/* Call by Value :- Java always calls by value
// if var value change in another function scope will be limited to that function only when value passes to another function java make copy of it,
 the operation perform on variable will not affect the original value


 Call by refrence :- In this original value refrence is used doesn't make any copy
 */
public class index {
    public static void calculateSum(int a, int b){
        int temp =a;  // here swap operation is performed
        a=b;
        b=temp;
        System.out.println(" a = " +  a );
        System.out.println(" a = " +  b );
    }
   public static void main(String[] args) {
    // swap- value exchnage
    int a = 5;  // operation perform outside the main function doesn't affect the var value inside main function
    int b = 10;

    //swap
   
    System.out.println(" a = " +  a );
    System.out.println(" a = " +  b );
    calculateSum(a, b);

   } 
}
