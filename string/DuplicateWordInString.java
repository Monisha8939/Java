import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count;
        str=str.toLowerCase();
        String string[]=str.split(" ");
        for(int i=0;i<string.length;i++)
        {
            count=1;
            for(int j=i+1;j<string.length;j++)
            {
                if(string[i].equals(string[j]))
                {
                    count++;
                    string[j]="0";
                }
            }
            if(count>1 && string[i]!="0")
            {
                System.out.println(string[i]);
            }

        }
    }

}
