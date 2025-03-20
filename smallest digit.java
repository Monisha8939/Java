import java.util.Scanner;
public class smallestdigit {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int smallest=9; // Initialize smallest digit as 9 (max possible)
		while(n>0) {  // Loop through each digit of the number
			int digit=n%10;   // Extract the last digit
			if(digit<smallest) {    check the condition
				smallest=digit;
			}
			n=n/10;  // Remove the last digit from the number
				
			
		}
		System.out.println(smallest); //print the result
		
	}

}
