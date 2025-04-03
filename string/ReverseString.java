import java.util.Scanner;
public class reversestring {
	
	    public static void main(String args[] ) {
	    	Scanner s=new Scanner(System.in);
	    	String str=s.nextLine();
	    	String reverse=""; // Create a variable to store reversed string
	    	for(int i=str.length()-1;i>=0;i--)  // Loop to reverse the string
          {
	    		reverse+=str.charAt(i);  // Add each character to reverse variable
	    	}
	    	System.out.println(reverse); // Print the reversed string
	    }
	    }
