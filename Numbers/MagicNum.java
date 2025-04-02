import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int m = 0;
        while (n > 0) {
            int digit = n % 10;//Extract the digit
            sum += digit; //find the sum of the digit
            n = n / 10; // Remove the last digit
        }

        
        while (sum > 0) {
            int digit1 = sum % 10;//Extract the digit
            m += digit1; //find the magic number
            sum = sum / 10; // Remove the last digit
        }

        System.out.println(m);//display the magic number 
      s.close();
    }
}
