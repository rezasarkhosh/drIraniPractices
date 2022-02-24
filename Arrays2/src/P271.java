import java.util.Scanner;

public class P271 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=9;
		int m=5;
		int A[]=new int[45];
		int iA=0;
		for (int x=0;x<45;x++)
			A[x]=input.nextInt();
		int B[][]=new int[n][m];
           
		for (int x=0;x<m;x++)
			for (int y=0;y<n;y++)
				B[y][x]=A[iA++];

	}

}
