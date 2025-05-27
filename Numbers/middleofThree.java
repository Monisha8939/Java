import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int middle;
    if((a>=b && a<=c)||(a<=b && a>=c)){
      middle=a;
      System.out.println(middle+" "+"a is the middle number");
    }
    else if((b>=a && b<=c)||(b<=a && b>=c)){
      middle=b;
      System.out.println(middle+" "+"b is the middle number");
        }
    else{
      middle =c;
      System.out.println(middle+" "+"c is the middle number");
    }
  }
}
