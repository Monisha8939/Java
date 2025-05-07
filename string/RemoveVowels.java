import java.util.Scanner;
public class remove_Vowels {
	public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder result=new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(!"aeiouAEIOU".contains(String.valueOf(ch))) {
				result.append(ch);
			}
			
		}
		System.out.println(result);
	}
	
	
	
}
