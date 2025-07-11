import java.util.*;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    Map<Integer,Integer> map=new HashMap<>();
    for(int num:arr){
      map.put(num,map.getOrDefault(num,0)+1);
    }
    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
      System.out.println(entry.getKey()+"="+entry.getValue());
    }
  }
}
      
