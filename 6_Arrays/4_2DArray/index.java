import java.util.Scanner;

public class index {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();

    int [][] num = new int [row][col];

    //for input
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            num[i][j] = sc.nextInt();
            
        }
    }

    //for output
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            System.out.print(num[i][j] + " ");
        }
        System.out.println();
    }
   } 
}
