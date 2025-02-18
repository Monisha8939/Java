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
//reverse a string
import java.util.Scanner;
class Reverse
  {
    public static void main(String arrgs[])
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();//get the input from the user
      String str1=""; // Initialize an empty string to store the reversed string
      for(int i=arr.length()-1;i>=0;i--)  // Loop to reverse the string
        {
        str1 + =str.charAt(i); // Append each character in reverse order
        }
      System.out.println(str1);
    }
  }
        
    
