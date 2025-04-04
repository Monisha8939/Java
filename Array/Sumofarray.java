import java.util.Scanner;

class ArraySumUserInput 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n]; // Create an array of size n

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate sum of array elements
        int sum =0;
        for (int num : numbers) {
            sum += num; //calculate the sum of arr
        }

      
        System.out.println( sum);

        // Close the scanner
        scanner.close();
    }
}
