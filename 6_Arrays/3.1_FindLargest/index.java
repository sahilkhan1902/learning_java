public class index {
    public static int getLargest(int number []){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if(Largest < number[i]){
                Largest = number[i];
            }
            if(Smallest > number[i]){
                Smallest = number[i];
            }
        }
        System.out.println("The smallest value is " + Smallest);
        return Largest;
    }
    public static void main(String[] args) {
        int number [] ={ 2,4,6,3,7};
        System.out.println("The largest value is " + getLargest(number));
    }
    
}
