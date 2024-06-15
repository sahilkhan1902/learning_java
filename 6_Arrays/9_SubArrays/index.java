
public class index {
    public static void subArray(int number []){
        int tp =0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k]+ " ");
                    }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total no subArray pair is= "+ tp);
    }
    public static void main(String[] args) {
        int number []= {2, 4, 6, 8, 10, };
        subArray(number);
    }
}
