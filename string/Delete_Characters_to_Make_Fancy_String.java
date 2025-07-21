import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder result=new StringBuilder();
    for(int i=0;i<s.length();i++){
      int len=result.length();
      if(len>=2 && result.charAt(len-1)==s.charAt(i) && result.charAt(len-2)==s.charAt(i)){
        continue;
      }
        result.append(s.charAt(i));
      
    }
    System.out.println(result.toString());
  }
}
