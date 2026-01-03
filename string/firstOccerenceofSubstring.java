import java.util.Scanner;
public class FirstOccurenceofSubstring {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine(); //Give the input for String
		String str1=s.nextLine(); //Give the input for Substring 
		int index=str.indexOf(str1);  // Find the index of the first occurrence of str1 in str
		if(index!=-1)  // If the substring is found, print its index
    {
			System.out.println( index);
		}
		else  // If the substring is not found, print a message
    {
			System.out.println("this is not present in the string  ");
		}
	}

}
