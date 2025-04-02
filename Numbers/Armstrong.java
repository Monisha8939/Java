import java.util.Scanner;
class armstrong {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();//get the input from the user
        int e=n;
        int ans=0;
        while(n!=0)
        {
            int l=n%10;//Take the last value of the input
            int a=l*l*l;//cube of the digits
            ans=ans+a;
            n=n/10;//Remove the last digit 
            
        }
        if(e==ans)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }

    }
    
}
