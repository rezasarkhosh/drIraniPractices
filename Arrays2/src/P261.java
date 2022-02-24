import java.util.Scanner;

public class P261 {

	public static void main(String[] args) {
		Scanner input=new Scanner  (System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int A[][]=new int[n][m];
		 for (int x=0;x<n;x++)
			  for (int y=0;y<m;y++)
				 A[x][y]=input.nextInt();	
		 
		 System.out.println(" لطفا شماره سطر اول مورد نظر را وارد کنید:");
		 int a=input.nextInt();
		 System.out.println(" لطفا شماره سطر اول مورد نظر را وارد کنید:");
		 int b=input.nextInt();
		 
		 for (int x=0;x<m;x++)
		 {
			 int temp=A[a][x];
			 A[a][x]=A[b][x];
			 A[b][x]=temp;
			 
		 }
		 
		for (int x=0;x<n;x++)
		{
			for (int y=0;y<m;y++)
				System.out.print(A[x][y]+ " ");
			
			System.out.println();
		}
	}

}
