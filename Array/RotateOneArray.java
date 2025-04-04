//right rotate
import java.util.Scanner;
class Main
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int j=0;j<arr.length;j++)
        {
          arr[j]=s.nextInt();
        }
      int i=arr.length-1;
      int temp=arr[arr.length-1];
      while(i>0)
        {
          arr[i]=arr[i-1];
          i--;
        }
      arr[0]=temp;
          for(int j=0;j<arr.length;j++)
          {
            System.out.println("After rotate");
          System.out.print(arr[j]+" ");
          }
        
    }
  }
//left rotate
import java.util.Scanner;
class Main
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int j=0;j<arr.length;j++)
        {
          arr[j]=s.nextInt();
        }
      int i=0;
      int temp=arr[i];
      while(i<arr.length-1)
        {
          arr[i]=arr[i+1];
          i++;
        }
      arr[i]=temp;
     
     
          for(int j=0;j<arr.length;j++)
          {
          System.out.print(arr[j]+" ");
          }
        
    }
  }
