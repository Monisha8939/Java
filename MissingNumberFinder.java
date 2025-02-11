
import java.util.Scanner;

public class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() + 1; // Actual size should be n
        int[] arr = new int[n - 1];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // Calculate expected sum
        int expectedSum = (n * (n + 1)) / 2;

        // Find the missing number
        int missingNumber = expectedSum - sum;

        // Print result
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
