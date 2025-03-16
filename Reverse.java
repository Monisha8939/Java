//reverse a number
import java.util.Scanner;
class Reverse
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(); //get the input
      int ans=0;
      while(n!=0)
        {
          int l=n%10; //extract the last digit
          ans=ans*10+l;
          n=n/10; //remove the last digit
        }
      System.out.println(ans);
    }
  }
    
