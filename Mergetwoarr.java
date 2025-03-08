//merge two arrays
import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=n1+n2;
        int a[]=new int[n1]; //first array size
        int b[]=new int[n2]; //second array size
        int c[]=new int[n3];//result array
        for(int i=0;i<n1;i++)
            {
                a[i]=s.nextInt(); //get the input from user for first array
            }
        for(int i=0;i<n2;i++){
            b[i]=s.nextInt();  //get the input from user for second array
        }
        for(int i=0;i<n1;i++)
            {
                c[i]=a[i]; //store the first array elements in result array
            }
        for(int i=0;i<n2;i++)
            {
                c[n1+i]=b[i]; //store the second array elements in result array
            }
        for(int i:c){
            System.out.println(i+" ");// display the result
        }
    }
}
