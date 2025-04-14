import java.util.Scanner;
class A{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s1[]=s.split(" ");  // Split the input string into words
    String longestword=" ";
    int maxvalue=0;
    for(String s2:s1)
    {
      int l=s2.length();
      if(s2>maxvalue)   // Check if this word is longer than the current longest
      {
        longestword=s2; // Update longest word
        maxvalue=l;  // Update max length
      }
    }
    System.out.println(longestword); //Print the longestword
  }
}
