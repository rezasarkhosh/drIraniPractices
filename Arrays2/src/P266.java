import java.util.Scanner;

public class P266 {

	public static void main(String[] args) {
		Scanner input=new Scanner  (System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int A[][]=new int[n][m];
		 for (int x=0;x<n;x++)
			  for (int y=0;y<m;y++)
				 A[x][y]=input.nextInt();	
		 System.out.println(" لطفا عدد خود را برای جستجو وارد کنید:");
		 int p=input.nextInt();
		 int aval=0;
		 int dovom=0;
		 for (int x=0;x<n;x++)
		 {
			 for ( int y=0;y<m;y++)
				 if (A[x][y]==p)
				 {  
					 aval=x;
					 dovom=y;
				 }
         }
		 System.out.println("A[" + aval + "][" + dovom + "]");

	}

}
