import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int left=0;
    int right=s.length()-1;
    boolean ispalindrome=true;
    while(left<right){ 
      if(s.charAt(left)!=s.charAt(right)){
        ispalindrome=false;
        break;
      }
        left++;
      right--;
    }
    if(ispalindrome){
        System.out.println("palindrome");
    }
      else{
        System.out.println("this is not a palindrome");
       
      }
    }
  
}
    
      
    
