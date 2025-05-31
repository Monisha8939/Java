import java.util.Scanner;
import java.util.Arrays;
class A{
  public static boolean triple(int[] arr) {
		int n=arr.length;
		for(int k=n-1;k>=2;k--) {
			int i=0,j=k-1;
			while(i<j) {
				int sum=arr[i]+arr[j];
				if(sum==arr[k]) {
					return true;
				}
				else if(sum<arr[k]) {
					i++;
				}
				else {
					j--;
				}
			}
		}
		return false; 
	}
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int[] arr=new int[r];
    for(int i=0;i<r;i++){
      arr[i]=s.nextInt();
    }
    Arrays.sort(arr); 
    System.out.println(triple(arr));
  }
}
