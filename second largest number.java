import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int largest=-1; // Variable to store the largest digit
    int secondlargest=-1; // Variable to store the second largest digit
    while(n>0){ // Loop through each digit of the number
      int digit=n%10;  // Extract the last digit
      if(digit>largest){ // If the digit is greater than the current largest
        secondlargest=largest; // Update second largest before changing largest
        largest=digit; // Update largest
      }
      }
      else if(digit>secondlargest && digit!=largest){
        secondlargest=digit; // Update second largest
      }
      }
      n=n/10; // Remove the last digit from the number
    }
    System.out.println(secondlargest);
  }
}
      
