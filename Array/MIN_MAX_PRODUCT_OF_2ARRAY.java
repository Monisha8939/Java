import java.util.Scanner; 
public class MIN_MAX_PRODUCT_2ARRAY {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
		int[] arr2=new int[r];
		for(int i=0;i<r;i++) {
			arr2[i]=s.nextInt();
		}
	   int max=Integer.MIN_VALUE;
	   int min=Integer.MAX_VALUE;
	   for(int i=0;i<n;i++) {
		   if(arr1[i]>max) {
			   max=arr1[i];
		   }
	   }
	   for(int i=0;i<r;i++) {
		   if(arr2[i]<min) {
			   min=arr2[i];
		   }
	   }
	   System.out.println(max*min);
	}

}
