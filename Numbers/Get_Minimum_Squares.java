import java.util.*;
class A{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(perfectSquares(n));
  }
  public static int perfectSquares(int n)
  {
    int[] dp=new int[n+1];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;

    for(int i=1;i<=n;i++){
      for(int j=1;j*j<=i;j++){
        dp[i]=Math.min(dp[i],1+dp[i-j*j]);
      }
    }
    return dp[n];
  }
}
