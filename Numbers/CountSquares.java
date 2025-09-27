import java.util.Scanner;
class A{
public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int i=1;
		while(i*i<n) //check if i*i is less than n or not
      {
			count++; // If it's a square number, increase the count
			i++; //Increment the i value
		}
		System.out.println(count); //Print the result 
	}

}
