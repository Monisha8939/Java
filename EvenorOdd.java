import java.util.Scanner;
class demo
{
 public static void main(String args[])
  {
    Scanner s=new Scanner(System.in); 
    int n=s.nextInt(); // get input from User
    if(n%2==0) // if Remainder is 0 then even else Odd
    {
       System.out.println("Even");
     }
     else
     { 
       System.out.println("Odd");
     }
  }
}
