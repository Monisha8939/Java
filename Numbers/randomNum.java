//method 1 without using a math function
import java.util.Random;
import java.util.Scanner;
class random
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);  
      int n=s.nextInt();  
      Random rand=new Random(); //creating a instance of the random class
      int rand_int=rand.nextInt(n); //generate the random number
      System.out.println(rand_int);
    }
  }
//method 2 By using math function for generating random number
import java.util.Scanner;
class random
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println((int)(Math.random()*n)); //generate the random number to the range [0, n].
    }
  }
