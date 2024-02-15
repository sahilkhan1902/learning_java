
public class index {
    public static void DectoBin(int n){
        int myNum =n;
        int pow = 0;
        int binom = 0;
        while(n>0){
           int rem = n % 2;
            binom = binom + (rem* (int)Math.pow(10 ,pow));
            pow++;
            n/=2;
        }
        System.out.println("The Decimal to Binary of "+ myNum + " = "+ binom);
    }
    public static void main(String[] args) {
        DectoBin(7);
    }
    
}
