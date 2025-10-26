import java.util.*;
class A{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println(checkIsPangram(s));
  }
  public static boolean checkIsPangram(String s)
  {
    boolean[] seen=new boolean[26];
    s=s.toLowerCase();
    for(char ch:s.toCharArray())
      {
        if(ch>='a' && ch<='z'){
          seen[ch-'a']=true;
        }
      }
    for(boolean b:seen)
      {
        if(!b) return false;
      }
    return true;
  }
}
