//find the first non repeating character in a string
import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String word=s.nextLine(); // Read input string
    for(int i=0;i<word.length();i++)
      {
        char ch=word.charAt(i); // Get the current character
        boolean repeat=false; // Assume the character repeats
        for(int j=i+1;j<word.length();j++) // Loop through remaining characters
          {
            repeat=true; 
            break;  // Exit inner loop
          }
      }
    if(repeat==false) // This checks if the character is non-repeating

    {
      System.out.println(ch +" is the first non repeating character");
    }
  }
}
      
