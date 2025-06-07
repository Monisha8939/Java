import java.util.Scanner;

class SubSequenceofString {
	public static boolean isSubsequence(String main, String sub) {
		int i = 0, j = 0;
		while (i < main.length() && j < sub.length()) {
			if (main.charAt(i) == sub.charAt(j)) {
				j++;
			}
			i++;
		}
		return j == sub.length();
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter main string: ");
		String main = s.nextLine();
		System.out.print("Enter sub string: ");
		String sub = s.nextLine();
		System.out.println(isSubsequence(main, sub));
	}
}
