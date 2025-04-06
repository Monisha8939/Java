import java.util.Scanner;
public class Peak_element {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		boolean found=false;
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++)   // Loop to find and print peak elements
      {
			if((i==0||arr[i]>=arr[i-1]) && (i==n-1 ||arr[i]>=arr[i+1] )) // Check if arr[i] is a peak element
      {
				System.out.println(arr[i]); // Print the peak element
				found=true; // Mark that a peak was found
			}
			
		}
		if(!found) // If no peak element was found, print a message 
    {
			System.out.println("There is no peak element");
		}
	}
	

}
