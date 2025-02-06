//Check if a Number Exists in an Array
import java.util.Scanner;
class num
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt(); //Get the input from the user to search
       int n=s.nextInt(); //Get a array size from the user 
       int arr[]=new int[n]; //store the array size
       boolean found=false;  // Flag to check if number is found
       for(int i=0;i<n;i++)
       {
        arr[i]=s.nextInt();
        if(a==arr[i])  //check the number is found or not
        {
            System.out.println("true");
            found=true;
        }
        }
        if(!found){
        System.out.println(false);
        }
  
    }
}

      
