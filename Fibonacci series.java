import java.util.Scanner;
class  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int n = s.nextInt();
        int next = 0; // store the variable is next
      
        // Loop to generate Fibonacci series up to 'n' terms
        for (int i = 0; i < n; i++) {
            // Printing the current Fibonacci number
            System.out.println(first);

            // Calculating the next Fibonacci number
            next = first + second;

            // Updating the values for the next iteration
            first = second;
            second = next;
        }
    }
}
