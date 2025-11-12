import java.util.*;
class A{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    System.out.println(CountNumber(N));
  }
  public static int CountNumber(int N){
    int count=0;
    for(int i=1;i<=N;i++){
      int num=i;
      boolean hascount=false;
      while(num>0){
        int d=num%10;
        if(d==0){
          hascount=true;
          break;
        }
        num/=10;
      }
      if(hascount) count++;
    }
      return count;
    }
  }
          
  
