import java.util.Scanner;
class A{
public static void main(String[] args) {
  Scanner s.new Scanner(System.in);
  int n=s.nextInt();
	        for (int row = n; row >= 1; row--) //Outer loop 
          {
	            for (int num = n; num >= 1; num--) //Middle loop
                {
	                for (int count = 1; count <= row; count++) //Inner loop 
                  {
	                    System.out.print(num + " "); 
	                }
	            }
	            System.out.println();
	        }
	    }
	}
