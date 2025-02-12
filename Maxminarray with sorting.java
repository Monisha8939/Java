
import java.util.Scanner;
import java.util.Arrays;
  class demo
    {
      public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt(); // Get array Elements from Users
          }
        Arrays.sort(arr); // Sort the array
        System.out.println("Maximum Element:"+arr[n-1]); // Print last element which is the Maximum element
        System.out.println("Minimum Element:"+arr[0]); // Print First element which is the minimum element
        
      }
    }
