import java.util.Scanner;
class A
  {
    public static void main(String args[])
    {
      int sum=0; // Variable to store the sum of array elements
      Scanner s=new Scanner(System.in);
      int row=s.nextInt();  // Taking input for number of rows and columns
      int coloumn=s.nextInt();
      int arr[][]=new int[row][coloumn]; // Declaring a 2D array with user-defined size 
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<coloumn;j++)
            {
              arr[i][j]=s.nextInt();
            }
        }
      for(int i=0;i<row;i++)  // Loop to calculate the sum of all elements in the array
        {
          for(int j=0;j<coloumn;j++)
            {
      sum=sum+arr[i][j];  // Adding each element to sum
            }
        }
      System.out.print(sum); //print the result
    }
  }
           
