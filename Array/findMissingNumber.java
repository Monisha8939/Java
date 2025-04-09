import java.util.Scanner;

public class MissingNumber
  {
    public static void main(String[] args) 
  {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt(); //Read the number of elements in the array (n-1 elements)
        int arr[] = new int[r];
        for (int i = 0; i < r; i++) 
        {
            arr[i] = s.nextInt();  //Read r elements into the array
        }
        int n = r + 1;  //The actual count of numbers should be n (1 to n)

        long total = (long) n * (n + 1) / 2;   //Calculate the total expected sum from 1 to n
        long sum = 0;
        for (int num : arr) 
        {
            sum += num; // Calculate the sum of elements in the input array
        
        }

        
        long missing = total - sum; // The missing number is the difference between total and sum

        
        System.out.println(missing);
    }
}
