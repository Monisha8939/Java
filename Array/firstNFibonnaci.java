import java.util.Scanner;
import java.util.Arrays;
public class first_n_Fibonacci {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    int[] result=new int[n];
	    int a=0,b=1;
		for(int i=0;i<n;i++) {
			result[i]=a;  // Store the current Fibonacci number in result[i]
			int next=a+b;  // Calculate the next Fibonacci number
			a=b; // Shift: a becomes b
			b=next;    // Shift: b becomes next
		}
		System.out.println(Arrays.toString(result));
		}
}
