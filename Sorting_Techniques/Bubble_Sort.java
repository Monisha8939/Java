import java.util.Scanner;
class bubble_Sort{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n]; 
    for(int i=0;i<n;i++){ 
      arr[i]=s.nextInt();
    }
   bubble(arr);
    for(int num:arr){
      System.out.print(num+" ");
    }
  }
  public static void bubble(int[] arr)
  {
    int n=arr.length;
    
    for(int i=0;i<n-1;i++){
      boolean swapped=false;
      for(int j=0;j<n-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          swapped=true;
        }
      }
    if(!swapped) break;
    }
  }
}
          
