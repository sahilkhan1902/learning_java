public class index {
    public static void Kadane(int[] number) {
        int cs = 0; // current sum
        int ms = Integer.MIN_VALUE; // max sum

        // Modified Kadane's Algorithm
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];

            // Update the maximum sum
            if (cs > ms) {
                ms = cs;
            }

            // If the current sum is negative, reset it
            if (cs < 0) {
                cs = 0;
            }
        }

        // Handle all negative values
        if (ms == Integer.MIN_VALUE) {
            ms = number[0];
            for (int i = 1; i < number.length; i++) {
                if (number[i] > ms) {
                    ms = number[i];
                }
            }
        }

        System.out.println("The maxsum of subarray is = " + ms);
    }

    public static void main(String[] args) {
        int[] number = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadane(number);

        int[] negativeNumbers = {-8, -3, -6, -2, -5, -4};
        Kadane(negativeNumbers);
    }
}
