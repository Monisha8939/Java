import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int freq[]=new int[100];
    for(int i=0;i<n;i++){
      freq[arr[i]]++;
    }
    for(int i=0;i<freq.length;i++){
           if(freq[i]>0){
           System.out.println(i+" "+"occured"+" "+freq[i]+" "+"times");
            }
            }
  }
}
