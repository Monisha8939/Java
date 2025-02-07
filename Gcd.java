import java.util.Scanner;
class Gcd
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt(); 
      int b=s.nextInt(); 
      int temp=0; //store the temporary variable for swap
      while(b!=0)
        {
          temp=b; //store the b in temp
          b=a%b; // Update b with the remainder
          a=temp; // Assign temp to a
        }
      System.out.println("Gcd is:"+a);//print the result
    }
  }
