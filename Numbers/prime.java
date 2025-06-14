import java.util.Scanner;
class prime{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(); //get the input from the user
    if (n <= 1) {
      System.out.println("Not a prime");
      return;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.println("Not a prime");
        return;
      }
    }

    System.out.println("Prime");
  }
}
  
