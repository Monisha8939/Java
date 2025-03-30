import java.util.Scanner;
class A{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String n=s.nextLine();
String c=" ";
  for(int i=0;i<n.length();i++){
    char ch=n.charAt(i);
    if(ch>='A' && ch<='Z'){
      c+=(char)(ch+32);
    }
    else if(ch>='a' && ch<='z'){
      c+=(char)(ch-32);
    }
    else{
      c+=ch;
    }
  }
    System.out.println(c);
  }
}
    
