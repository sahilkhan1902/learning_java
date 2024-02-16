
public class index {
    public static boolean check(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return isPrime = false;

            }
        }
        return isPrime;
    }

    // most optimize way to check prime no
    public static boolean checkprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isprimerange(int n) {
        for (int i = 2; i <= n; i++) {
            if (checkprime(i)) {
                System.out.println("i = " + i);
            }

        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        isprimerange(250);
    }
}
