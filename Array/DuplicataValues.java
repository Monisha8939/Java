//find the duplicate values in arr
import java.util.Scanner;
class A
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(); //get the  size of the array
      int arr[]=new int[n]; //delcare the array size
      for(int i=0;i<n;i++)
        { 
          arr[i]=s.nextInt();//get the input from the usere 
        }
      for(int i=0;i<arr.length;i++) //check if the duplicate element is found or not
        {
          for(int j=i+1;j<arr.length;j++)
            {
              if(arr[i]==arr[j])
              {
                System.out.print("duplicate element is found:"+" "+arr[i]);
              }
            }
        }
    }
  }
// remove the duplicates 
import java.util.Scanner;
class A
  {
  public static void main(String args[])
    {
  Scanner s=new Scanner(System.in);
  int visited=-1;
  int n=s.nextInt();
  int arr[]=new int[n];
    for(int k=0;k<arr.length;k++)
      {
        arr[k]=s.nextInt();
      }
    for(int i=0;i<arr.length;i++)
      {
        if(arr[i]!=-1)
        {
        for(int j=i+1;j<arr.length;j++)
          {
            if(arr[i]==arr[j])
            {
              arr[j]=visited;
            }
          }
          System.out.print(arr[i]+" ");
        }
      }
  }
}
