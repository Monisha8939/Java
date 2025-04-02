import java.util.Scanner;
class A{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int sum=0;
    int fact,digit;
    int n=s.nextInt(); //Read the input
    int o=n; //store the original value
    while(n>0)
      {
        digit=n%10; //Extract the last digit
        fact=1;
        for(int i=1;i<=digit;i++) //calculate the factorial of the digit
          {
            fact*=i;
          }
        sum=sum+fact; // Add factorial to sum
        n=n/10;  // Remove last digit
      }
    if(o==sum){
      System.out.println("given number "+ r+" is a strong number");
    }
    else{
      System.out.println("given number "+ r+ is not a strong number");
    }
  }
}

        
