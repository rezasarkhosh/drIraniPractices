import java.util.Scanner;

public class P269 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=5;
		int m=9;
		int A[]=new int[45];
		int iA=0;
		for (int x=0;x<45;x++)
			A[x]=input.nextInt();
		int B[][]=new int[n][m];
		
		for (int x=0;x<n;x++)
			for (int y=0;y<m;y++)
				B[x][y]=A[iA++];
		
		for (int x=0;x<n;x++)
			 {
			for (int y=0;y<m;y++)
				System.out.print(B[x][y]+ " ");
			 System.out.println();
			 }
		
		
		
		

	}

}
