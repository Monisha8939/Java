import java.util.Scanner;
class swap { 
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(); //get the first number
        int b=s.nextInt(); //get the second number
        int temp=0;
        temp=a; //store a in temp
        a=b; //store b in a
        b=temp; //store temp in b
        System.out.println("After Swapping");
        System.out.println("a is:"+a); //print the a value
        System.out.println("b is:"+b); //print the b value
    }
}
