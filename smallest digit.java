import java.util.Scanner;
public class smallestdigit {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int smallest=9;
		while(n>0) {
			int digit=n%10;
			if(digit<smallest) {
				smallest=digit;
			}
			n=n/10;
				
			
		}
		System.out.println(smallest);
		
	}

}
