import java.util.Scanner;
public class zero_one_trianglepattern {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) // Outer loop for rows
			{
			for(int j=1;j<=i;j++)  // Inner loop for columns 
			{
				if((i+j)%2==0) // Check if the sum of row and column index is even
				{
					System.out.print("1" + " "); // Print 1 if even
				}
				else {
				System.out.print("0" + " "); // Print 0 if odd
			}
			}
			System.out.println(); // Move to the next line after each row
		}
	}

}
