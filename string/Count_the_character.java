import java.util.Scanner;
class A
{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String sc=s.nextLine();
    int upper=0,lower=0,digit=0,special=0;
    for(int i=0;i<sc.length();i++){
      char ch=sc.charAt(i);
      if(Character.isUpperCase(ch)){ 
        upper++;
      }
      else if(Character.isLowerCase(ch)){
        lower++;
      }
      else if(Character.isDigit(ch)){
        digit++;
      }
      else{
        special++;
      }
    }
    System.out.println("upper case is:"+upper);
    System.out.println("lower case is:"+lower);
    System.out.println("digit is:"+digit);
    System.out.println("special character is:"+special);
  }
}
