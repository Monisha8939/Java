import java.util.Scanner;
class A{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int date=s.nextInt();
    int n=s.nextInt();
    int[] car=new int[n];
    int[] fine=new int[n];
    for(int i=0;i<car.length;i++){
      car[i]=s.nextInt();
    }
    for(int j=0;j<fine.length;j++){
      fine[j]=s.nextInt();
    }
    System.out.println(totalfine(date,car,fine));
	}
	public static int totalfine(int date,int[] car,int[] fine) {
		long total=0;
		for(int i=0;i<car.length;i++) {
		if((date%2==0 && car[i]%2!=0)||(date%2!=0 && car[i]%2==0)){
			total+=fine[i];
		}
		}
		return (int) total;
	}
}
  
