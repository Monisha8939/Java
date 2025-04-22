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

		int d=s.nextInt();
		d=d%n;
    reverse(arr, n - d, n - 1);  
        reverse(arr, 0, n - d - 1); 
        reverse(arr, 0, n - 1); 
      for(int j=0;j<arr.length;j++)
        {
          System.out.print(arr[j]+" ");
        }
	}
    static void reverse(int[] arr,int start,int end) {
			while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
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

		int d=s.nextInt();
		d=d%n;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		for(int j=0;j<arr.length;j++)
        {
          System.out.print(arr[j]+" ");
        }
		
	}
		static void reverse(int[] arr,int start,int end) {
			while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			}
		}	
		 
	}
     
