import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<=n;i++){  // Outer loop for each row
      for(int j=1;j<=n;j++){ // Inner loop to print spaces
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){  // Inner loop to print stars
        System.out.print("*");
      }
      System.out.println();  // Move to the next line after each row
    }
  }
}
        
      
