import java.util.Scanner;

public class P285 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	int x=input.nextInt();
	int p=0;
	p=Maghsom(x);
	System.out.println(p);
		
		
	}
 public static int Maghsom(int x)
 {
	 int c=0;
	 for (int y=1;y<=x;y++)
		 if (x%y==0)
			 c++;
	 return c;
	 
	 
	 
 }
}
