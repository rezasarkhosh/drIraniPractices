import java.util.Scanner;

public class P262 {

	public static void main(String[] args) {
		Scanner input=new Scanner  (System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int A[][]=new int[n][m];
		 for (int x=0;x<n;x++)
			  for (int y=0;y<m;y++)
				 A[x][y]=input.nextInt();	
		 
		 System.out.println(" لطفا شماره ستون اول مورد نظر را وارد کنید:");
		 int a=input.nextInt();
		 System.out.println(" لطفا شماره ستون دوم مورد نظر را وارد کنید:");
		 int b=input.nextInt();
		 
		 for (int x=0;x<n;x++)
		 {
			 int temp=A[x][a];
			 A[x][a]=A[x][b];
			 A[x][b]=temp;
			 
		 }
		 
		for (int x=0;x<n;x++)
		{
			for (int y=0;y<m;y++)
				System.out.print(A[x][y]+ " ");
			
			System.out.println();
		}
		
		
	}

}
