import java.util.Scanner;
public class second smallest {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int smallest=10; 
		int secondsmallest=10;
		while(n>0) {
			int digit=n%10;
			if(digit<smallest) {
				secondsmallest=smallest;
				smallest=digit;
			}
			else if(digit<secondsmallest && digit!=smallest) {
				secondsmallest=digit;
			}
			n=n/10;
		
		}
		System.out.println(secondsmallest);
	}
