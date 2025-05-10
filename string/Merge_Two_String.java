import java.util.Scanner;

public class A {

    static String merge(String S1, String S2) {
        StringBuilder result = new StringBuilder(); 
        int minLength = Math.min(S1.length(), S2.length());  // Find the length of the shorter string

        for (int i = 0; i < minLength; i++)   // Merge characters alternately from both strings
        {
            result.append(S1.charAt(i));
            result.append(S2.charAt(i));
        }

        if (S1.length() > minLength) // Add the remaining characters from the longer string
        {
            result.append(S1.substring(minLength));
        } else if (S2.length() > minLength) {
            result.append(S2.substring(minLength));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String S1 = sc.nextLine(); 
        System.out.print("Enter second string: ");
        String S2 = sc.nextLine();
      
        String merged = merge(S1, S2);  // Call merge method and print result
        System.out.println("Merged string: " + merged);
    }
}
