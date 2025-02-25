import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        char ch = s.next().charAt(0); // Get character input from user
      
        int ascii = (int) ch; // Display ASCII value
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        
    }
}
  
