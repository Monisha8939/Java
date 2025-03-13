import java.util.Scanner;
public class searchnumber 
{
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);  // Create a Scanner object to read input
		int x=s.nextInt();  // Read the number to be searched
		int n=s.nextInt();   // Read the size of the array
		int arr[]=new int[n];
		boolean flag=false;  // Initialize a flag to check if the number is found
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=s.nextInt();
                        if(x==arr[i])   // Check if the current element matches 'x'
                                {
				flag=true; // Set flag to true if found
				break;
                                }
		}			
			if(flag) // Print the result based on the flag value
				{
				System.out.println(x + " is present in the array");
			        }
			else 
			{
			System.out.println(x+ " is not  present in the array");
			}
		}	
	}


