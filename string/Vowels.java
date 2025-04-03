import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        //Check if it is a letter
        if (Character.isLetter(ch)) {
            // Check if it is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter a letter.");
        }

        scanner.close();
    }
}
// count vowels present in the string
import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int vowels=0;  // Variable to count vowels
        String str=s.nextLine(); // Read input string
        str=str.toLowerCase();  // Convert string to lowercase
        int len=str.length(); // Get length of the string
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){ // Check if character is a vowel
                vowels++; // Increment vowel count
            }
        }
            System.out.println(vowels); // Print the total number of vowels
        
    }
}
