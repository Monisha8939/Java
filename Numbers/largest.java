import java.util.Scanner;
class largest
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt(); //get the input for first number
      int b=s.nextInt(); //get the input for second number
      int c=s.nextInt(); //get the input for third number
      // Check which number is the largest
      if(a>b && a>c)
      {
        System.out.println("a is largest number");
      }
      else if(b>a && b>c)
      {
        System.out.println("b is largest number");
      }
      else{
        System.out.println("c is largest number");
      }
    }
  }
//find the largest digit
import java.util.Scanner;
public class LargestDigit {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();  // Read input number
		int largest=0; // Initialize largest digit as 0 
		while(n>0) { // Loop through each digit of the number
			int digit=n%10; // Extract the last digit
			if(digit>largest) { check the condition
				largest=digit; //store the largest value
			}
				n=n/10;//remove the last digit from the number
		}
		System.out.println(largest); //print the result
		
		
	}

}
