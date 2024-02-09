
public class index {
    public static void BntoDec(int binom){
        int myNum = binom;
        int pow  = 0;
        int dec =0;
        while(binom>0){
            int lastDigit = binom%10;
            dec= dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
           binom= binom/10;
        }
        System.out.print("The Binary to decimal of " + myNum + " = " + dec);
      

    }
    public static void main(String[] args) {
       BntoDec(101);
    }
    
}
