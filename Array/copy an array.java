import java.util.Scanner;
import java.util.Arrays;
public class copyarray {
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[a.length];  // Declare a new array to store the copied values
		int j=0;  // Index for the new array
		for(int i=0;i<a.length;i++)   // Copy elements from array 'a' to array 'b'
		{
			b[j]=a[i];
			j++;
}
		System.out.println(Arrays.toString(b)); // Print the copied array
		
  }
}
