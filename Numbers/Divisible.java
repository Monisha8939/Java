import java.util.Scanner;
class Divisible {
  public static void main(String args[])
    {
    Scanner s= new Scanner (System.in);
    int i= s.nextInt(); //get the input from the user
    if(i%3==0 && i%5==0) //check the given number is divisible by 3and5
       {
          System.out.println("both are divisible by 3 and 5");
        }
    else
    {
          System.out.println("not Divisible by both 3 and 5");
        
      }
  }
}
