import java.util.Scanner;
public class thidLargest {
	public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
    // Initialize first, second, third largest as minimum possible value
			int first=Integer.MIN_VALUE;
			int second=Integer.MIN_VALUE;
			int third=Integer.MIN_VALUE;
			for(int num:arr) {
				if(num>first) { // Update all three if current number is greater than first
					third=second;
					second=first;
					first=num;
				}
				else if(num>second && num!=first) {  // Update second and third if current number is greater than second
					third=second;
					second=num;
				}
				else if(num>third && num!=second && num!=first){  // Update only third if current number is greater than third
					third=num;
				}
				
			}
			System.out.println(first); // Print the largest number
	}

}
