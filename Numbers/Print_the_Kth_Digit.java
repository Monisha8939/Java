import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int k=s.nextInt();
    System.out.println(kthDigit(a,b,k));
  }
  public static int kthDigit(int a,int b,int k){
    long result=1;
    for(int i=0;i<b;i++){
      result*=a;
    }
    for(int i=1;i<k;i++){
      result/=10;
    }
    return (int)(result %10);
  }
}
