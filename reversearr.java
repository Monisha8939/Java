//reverse a array
import java.util.Scanner;
class reverse
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[];
      int i=0,j=arr.length-1,temp; // Initialize pointers for swapping 
      for(int k=0;k<arr.length;k++) // get a input for n elements into the array
        {
          arr[k]=s.nextInt();
        }
      while(i<j)
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
      for(int k=0;k<arr.length-1;k++)  // Reverse the array using two-pointer approach
        {
          System.out.println("After reversing");
          System.out.println(arr[k]); 
        }
      
    }
  }
          
