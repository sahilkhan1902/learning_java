// Arrays :- List of all elements of the same  type placed in a contigous memory location 
// datatype arrayName [] = new datatype [size]
public class index {
   public static void main (String args []){
    int [] marks = new int[3];
    marks[0]=2;
    marks[1]=5;
    marks[2]=5;
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]);    // printing array using for loop
        
    }
   } 
}
