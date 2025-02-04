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
