import java.util.Scanner;
class multiplicatication
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(); 
      for(int i=1;i<=10;i++) // Loop to print multiplication table from 1 to 10
        {
          System.out.println(n+"*"+i+"="+n*i); //print the result
        }
    }
  }
