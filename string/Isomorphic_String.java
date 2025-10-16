import java.util.*;
class A{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    String s2=s.nextLine();
    System.out.println(isomorphic(s1,s2));
  }
  public static boolean isomorphic(String s1,String s2)
  {
    HashMap<Character,Character>map=new HashMap<>();
    HashSet<Character>set=new HashSet<>();
    for(int i=0;i<s1.length();i++){
      char sc=s1.charAt(i);
      char tc=s2.charAt(i);
      if(map.containsKey(sc)){
        if(map.get(sc)!=tc){
          return false;
        }
      }
      else{
        if(set.contains(tc)){
          return false;
        }
        map.put(sc,tc);
        set.add(tc);
      }
    }
    return true;
  }
}
