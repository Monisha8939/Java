import java.util.Scanner;
class GCD_LCM {
	public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
		int num1=a;
		int num2=b;
		fun(a,b); //Call the function
	}
		static void fun(int a,int b) {
		int num1=a;
		int num2=b;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
			}
		int gcd=a;
		int lcm=(num1*num2)/gcd;
		System.out.println("gcd is:" +" "+gcd);
		System.out.println("lcm is:" +" "+lcm);
		
	}

}
