import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    // Read three integers from the user
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int middle;
    if((a>=b && a<=c)||(a<=b && a>=c)){  // Check if 'a' is the middle value
      middle=a;
      System.out.println(middle+" "+"a is the middle number");
    }
    else if((b>=a && b<=c)||(b<=a && b>=c)){  // Check if 'b' is the middle value
      middle=b;
      System.out.println(middle+" "+"b is the middle number");
        }
    else{  // Otherwise, 'c' is the middle value
      middle =c;
      System.out.println(middle+" "+"c is the middle number");
    }
  }
}
