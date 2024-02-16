/*
 * Scope 
   - Block scope:- The initialize variable can be access in that particular block only.
   - Method scope or function scope: The initialize variable can be access accross function.
 */
public class index {

    public static void main(String[] args) {
      int p=5; //  here p is inside the function scope
      {
        int s=6; // s is inside the block scope
        System.out.println(p);
        System.out.println(s);
    }  
   // System.out.println(s); // her it will throw error as s is block scope variable it can't access outside the scope
    }
}
