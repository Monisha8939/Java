//Method 1 using array sorting
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
//Method 2 Find Maximum and Minimum Value in an Array Using Iteration

import java.util.Scanner;
class maxmin{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int count=0;
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt(); //get the input from the user
        }
        int max_value=arr[0]; // Initialize max with the first element
        int min_value=arr[0]; // Initialize min with the first element

        for(int i=0;i<arr.length;i++)  // Loop through the array to find the max and min values
        {
            if(arr[i]>max_value) // Check for max value

            {
                max_value=arr[i];
            }
            if(arr[i]< min_value) // Check for min value

            {
                min_value=arr[i];
            }

        }
        System.out.println("max value is:" + " "+max_value);
        System.out.println("min value is :"+" "+min_value);
    }
}

        
