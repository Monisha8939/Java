import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n-1;i++)
    {
      arr[i]=s.nextInt();
    }
    int index=s.nextInt(); // Index to insert 
    int element=s.nextInt(); // Element to insert
    for(int i=n-2;i>=index;i--) // Shift elements to the right
      {
      arr[i+1]=arr[i];
    }
    arr[index]=element;  // Insert the element
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" "); //Display updated array
    }
  }
}
                        
