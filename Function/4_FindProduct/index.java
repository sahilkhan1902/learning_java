

public class index {
    public static int product(int a, int b){ /// calculate the product of a and b
        int pr= a*b;
        return pr;
    }

    public static int factorial (int n){ // calculate the factorial of n number
        int f=1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
       int fact = factorial(5);
       int product= product(8,9);
        System.out.println(product);
        System.out.println(fact);

    }
    
}
