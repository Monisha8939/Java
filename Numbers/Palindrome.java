import java.util.Scanner;
class palindrome
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(); //get the input from the user
      int a=n; // Store the original number
      int ans=0;
      while(n!=0)
        {
          int l=n%10; // Get the last digit 
          ans=ans*10+l;  //calculated the number
          n=n/10; // Remove the last digit
        }
      if(ans==a) //check the original number and calculated numbers are same
      {
        System.out.println("Palindrome");
      }
      else {
        System.out.println("not a palindrome");
      }
    }
  }
