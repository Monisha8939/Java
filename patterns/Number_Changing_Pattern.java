import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(  System.in);
    int n=s.nextInt();
    int num=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        num++;
        System.out.print(num+" ");
      }
      System.out.println();
    }
  }
}
        
