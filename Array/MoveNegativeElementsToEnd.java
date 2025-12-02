import java.util.*;
class A{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int[] result=moveNegative(n, arr);
    for(int i=0;i<n;i++){
    System.out.print(result[i]);
    }
  }
  public static int[] moveNegative(int n,int arr[]){
    int[] temp=new int[n];
    int r=0;
    for(int i=0;i<n;i++){
      if(arr[i]>=0)
      {
        temp[r++]=arr[i];
      }
    }
    for(int i=0;i<n;i++){
      if(arr[i]<0){
        temp[r++]=arr[i];
      }
    }
    return temp;
  }
}
        


    
