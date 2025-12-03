import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(); // Read the size of the square 

    for(int i=1;i<=n;i++)  // Rows 
    {
      for(int j=1;j<=n;j++)  // Columns
        {
          System.out.print("*"); 
        }
      System.out.println();// Move to next line after each row
    }
    s.close();
  }
}
