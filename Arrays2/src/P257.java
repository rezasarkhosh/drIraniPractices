import java.util.Scanner;

public class P257 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	int n=input.nextInt();
	int m=input.nextInt();
	int A[][]=new int[n][m];
	 for (int x=0;x<n;x++)
	  for (int y=0;y<m;y++)
		 A[x][y]=input.nextInt();		 
	
	
	for (int x=0;x<n;x++)
	{
		if ((x%2)==0)
			for (int y=0;y<m;y++)
				System.out.print(A[x][y] + " ");
		System.out.println();
	}
	
	
	

	}

}
