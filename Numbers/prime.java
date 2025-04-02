import java.util.Scanner;
class prime{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(); //get the input from the user
    int count=0;
    for(int i=2;i<n;i++)
      {
        if(n%i==0) // If n is divisible, it's not a prime number
        {
          count++;  // Increase count if a factor is found
        }
      }
     if(count==0) // If no factors were found, the number is prime
        {
          System.out.println("Prime");
        }
        else{
          System.out.println("not a prime");
        }
  }
}
  
