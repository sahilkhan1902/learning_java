
public class index {
    public static void maxsubArray(int number []){
        int curr =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                curr =0;
                for (int k = i; k <= j; k++) {
                   curr+= number[k];
                }
                System.out.println(curr);
               if(maxSum < curr){
                maxSum = curr;
               }
            }
            
        }
        System.out.print("maxsum= "+ maxSum);
    }
    public static void main(String[] args) {
        int number []= {2, 4, 6, 8, 10, };
        maxsubArray(number);
    }
}
