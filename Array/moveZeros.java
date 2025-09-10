import java.util.Scanner;
class moveZeros{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=s.nextInt();
      }
    ismoveingzeros(arr);
    for(int num:arr)
    {
    System.out.println(num+" ");
    }
  }
  public static void ismoveingzeros(int arr[])
  {
    int i=0;
    for(int num:arr){
      if(num!=0)
      {
        arr[i++]=num;
      }
      
    }
    while(i<arr.length)
      {
        arr[i++]=0;
      }
  }
}
    
