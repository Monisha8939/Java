import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
     Arrays.sort(arr);
    int i=0;
    for(int j=1;j<arr.length;j++){
      if(arr[j]!=arr[i]){
       i++;
        arr[i]=arr[j];
      }
    }
    for(int k=0;k<=i;k++){
    System.out.println(arr[k]);
    }
  }
}
