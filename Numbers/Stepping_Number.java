import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=Integer.toString(n);
		boolean stepping=true;
		for(int i=0;i<s.length()-1;i++) {
			int a=s.charAt(i)-'0';
			int b=s.charAt(i+1)-'0';
			int diff=Math.abs(a-b);
			if(diff!=1) {
			   stepping=false;
			}
		}
		if(stepping) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}

