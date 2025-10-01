import java.util.Scanner;
 class Sort 
 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
     {
      arr[i]=sc.nextInt();
    }
    int mid=0; // points at index 0
    int high=n-1; // points at index n-1
    int low=0; // points at index 0
    int temp=0;
    while(mid<=high)
    {
      if(arr[mid]==0) // if arr[mid]==0,swap arr[mid] and arr[low]
      {
        temp=arr[mid]; 
        arr[mid]=arr[low];
        arr[low]=temp;
        mid++; // move mid
        low++; // move low
      }
      else if(arr[mid]==1) // if arr[mid]==1,move mid
      {
         mid++;
      }
      else // arr[mid]==2,swap arr[mid] and arr[high]
      {
                temp=arr[mid]; 
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
      }
    }
    System.out.println("sorted Array:");
    for(int num:arr)
    { 
      System.out.print(num+" ");
    }
    sc.close();
  }
 }
