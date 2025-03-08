//find all substrings of a string
import java.util.Scanner;
class A{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    for(int i=0;i<str.length();i++) // outer loop selects the starting index
      {
        for(int j=i+1;j<str.length;j++) // Inner loop selects the ending index
          {
            System.out.println(str.substring(i,j)); // Print substring from index i to j-1
          }
      }
  }
}
