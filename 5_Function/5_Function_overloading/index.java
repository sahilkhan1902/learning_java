/*
 * Function overloding - Multiple function with the same name but different params
 *  --types of params
 * -- no of params 
 * --- it does not depent on return type 
 */
public class index {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){ // here three params used with same sum name function
        return a+b+c ;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(sum(2,5,7));
    }
    
}
