import java.util.Scanner;
class last{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(); //get the input from the user
        int l=n%10; //find the last digit
        System.out.println("last Digit is: "+l);
    }
}
