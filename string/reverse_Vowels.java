import java.util.*;
class A{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String vowels="aeiouAEIOU";
    char[] arr=s.toCharArray();
    int left=0,right=s.length()-1;
    while(left<right){
      while(left<right && vowels.indexOf(arr[left])==-1){
        left++;
      }
      while(left<right && vowels.indexOf(arr[right])==-1){
        right--;
      }
      char temp=arr[left];
      arr[left]=arr[right];
      arr[right]=temp;
      left++;
      right--;
    }
    System.out.println(new String(arr));
  }
}
