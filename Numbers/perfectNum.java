import java.util.Scanner;
class Perfectnumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //get the input from the user
        int sum = 0; // Variable to store the sum of divisors

        // Loop to find the sum of divisors of the number
        for (int i = 1; i < n; i++)
        { 
            if (n % i == 0) // Check if 'i' is a divisor of 'n'
            {
                sum += i; // Add the divisor to the sum 
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == n) {
            System.out.println("perfect number"); 
        } else {
            System.out.println("not a perfect number"); 
        }
    }
}
