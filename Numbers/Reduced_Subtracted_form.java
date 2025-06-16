public class Reduced_Subraction_of2Digit {
	public static String reducedsub(String num) {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<num.length()-1;i++) {
			int a=num.charAt(i)-'0';
			int b=num.charAt(i+1)-'0';
			int diff=Math.abs(a-b);
			result.append(diff);
		}
		return result.toString();
	}
	public static void main(String args[]) {
		int n=6928;
		String num=Integer.toString(n);
		while(num.length()>2) {
			num=reducedsub(num);
		}
		System.out.println(num);
	}
}

