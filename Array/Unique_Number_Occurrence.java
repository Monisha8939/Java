import java.util.*;
class A
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=s.nextInt(); 
    }
      System.out.println(Unique(arr));
    }
    public static boolean Unique(int arr[]){
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int n:arr){
        map.put(n,map.getOrDefault(n,0)+1);
      }
      HashSet<Integer>set=new HashSet<>(map.values());
      return map.size()==set.size();
    }
  }
