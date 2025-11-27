import java.util.*;
class A{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    ArrayList<Integer>res=AvgPrefix(arr,n);
    for(int x:res){
    System.out.print(x+" ");
    }
  }
  public static ArrayList<Integer> AvgPrefix(int[] arr,int n){
    long sum=0;
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=0;i<n;i++){
      sum+=arr[i];
      int avg=(int)(sum/(i+1));
      list.add(avg);
    }
    return list;
  }
}
      
                     
  
