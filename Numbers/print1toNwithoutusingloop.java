import java.util.Scanner;
public class A {
	public static void number(int n)  
  {
		if(n==0) {
			return;
		}
		number(n-1); // recursion before printing
		System.out.print(n+" "); //print after recursion call
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		number(n); //call the function
		
	}
}
