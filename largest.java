import java.util.Scanner;
class largest
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
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
		int n=s.nextInt();
		int largest=0;
		while(n>0) {
			int digit=n%10;
			if(digit>largest) {
				largest=digit;
			}
				n=n/10;
		}
		System.out.println(largest);
		
		
	}

}
