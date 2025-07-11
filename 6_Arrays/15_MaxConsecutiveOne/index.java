import java.util.Scanner;

public class index {

    // Method to find the maximum number of consecutive 1s
    public static int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currCount++;
            } else {
                maxCount = Math.max(currCount, maxCount);
                currCount = 0;
            }
        }

        return Math.max(currCount, maxCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the array elements (only 0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the function and print result
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum number of consecutive 1s: " + result);
    }
}
