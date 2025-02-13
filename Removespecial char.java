import java.util.Scanner;

public class RemoveNonAlphanumericManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is alphanumeric (letter or digit)
            if ((ch >= 'a' && ch <= 'z') || 
                (ch >= 'A' && ch <= 'Z') || 
                (ch >= '0' && ch <= '9')) {
                result.append(ch); // Add to result if valid
            }
        }

        // Output the cleaned string
        System.out.println("String after removing non-alphanumeric characters: " + result.toString());

        scanner.close();
    }
}
