

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
    public static int binom(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);

        int fact_nmr = factorial(n-r);

        int finalfact = fact_n / (fact_r*fact_nmr);
         return finalfact;

    }
    public static void main(String[] args) {
    //    int fact = factorial(5);
    //    int product= product(8,9);
    //     System.out.println(product);
    //     System.out.println(fact);


    System.out.println(binom(5, 3));

    }
    
}
