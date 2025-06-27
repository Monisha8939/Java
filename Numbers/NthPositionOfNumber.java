import java.util.*;
class A{
public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  long n=s.nextLong();
  System.out.println(nthpos(n));
}
  public static long nthpos(long n){
    long pos=1;
    while(pos*2<=n){
      pos*=2;
    }
    return pos;
  }
}
