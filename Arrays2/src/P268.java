import java.util.Scanner;

public class P268 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=2;
		int m=5;
		int A[]=new int[10];
		int iA=0;
		for (int x=0;x<10;x++)
			A[x]=input.nextInt();
		int B[][]=new int[n][m];
		
		for (int x=0;x<2;x++)
			for (int y=0;y<5;y++)
				B[x][y]=A[iA++];
		
		for (int x=0;x<2;x++)
			 {
			for (int y=0;y<5;y++)
				System.out.print(B[x][y]+ " ");
			 System.out.println();
			 }
	}

}
