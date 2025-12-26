import java.util.Scanner;
public class RightAngleTriangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) //Outer loop for row
        { 
            for (int j = 1; j <= i; j++) //Inner loop for column 
            {  
                System.out.print("*"); //print th * without a new line
            }
            System.out.println(); 
        }
    }
}
