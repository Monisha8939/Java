//count even and odd in an array
import java.util.Scanner;
class A
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();   
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=s.nextInt(); // Taking input for the size of the array
        }
      int even=0; // Counter for even numbers
      int odd=0; // Counter for odd numbers
      for(int i:arr)
        {
          if(i%2==0) //check if the number is even
          {
            even++; //Increment the even 
          }
          if(i%2!=0) //check if the number is odd
          {
            odd++; //Increment the odd
          }
        }
      System.out.println("even number is:"+even); 
      System.out.println("odd number is:"+odd);
    }
  }
        
