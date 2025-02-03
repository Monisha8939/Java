import java.util.Scanner;
class positive
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(); //get the input from the user
      if(n>0) //Check the give number is positive or negative
      {
        System.out.println("positive");
      }
      else{
          System.out.println("negative");
      }
    }
  }
        
        
    
