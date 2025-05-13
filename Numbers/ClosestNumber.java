import java.util.Scanner;
public class ClosestNumber {
	static int close(int n,int m) {
		int lower=(n/m*m);  // Find the multiple of m that is less than or equal to n
		int upper;
		if(n*m>0) { // Find the next number greater than n that is divisible by m
			upper=lower+m;
			
		}
		else {
			upper =lower-m;
		}
    
   // Find how far lower and upper are from n
		int difflower=Math.abs(n-lower);
		int diffupper=Math.abs(n-upper); 
		if(difflower<diffupper) {  // Return the number that is closer to n
			return lower;
		}
		else if(diffupper<difflower) {
			return upper;
		}
		else {
			if( Math.abs(lower)>Math.abs(upper))  // If both are equally close, return the one with greater absolute value
				return lower;
			else
				return upper;
					
		}
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		System.out.println(close(n,m)); // Call the method and print the result
		
	}

}
