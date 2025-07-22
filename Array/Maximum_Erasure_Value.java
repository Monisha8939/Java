import java.util.*;
class A{
  public int maximumUniqueSubarray(int[] arr){
    Set<Integer> set=new HashSet<>();
    int start=0,sum=0,maxsum=0;
    for(int i=0;i<arr.length;i++){
      while(set.contains(arr[i])){
        set.remove(arr[start]);
        sum-=arr[start];
        start++;
      }
      set.add(arr[i]);
      sum+=arr[i];
      maxsum=Math.max(sum,maxsum);
    }
      return maxsum;
  }
  public static void main(String argss[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    A obj=new A();
    System.out.println(obj.maximumUniqueSubarray(arr));
  }
}
