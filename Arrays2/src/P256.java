import java.util.Scanner;

public class P256 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int A[][]=new int [n][m];
		for (int x=0;x<n;x++)
			for (int y=0;y<m;y++)
				A[x][y]=input.nextInt();
		int count=0;
		int sum=0;
		for (int x=0;x<n;x++)
			for (int y=0;y<m;y++)
				if (x==y)
					{ 
					sum=A[x][x]+sum;
					count++;
					}
		double Y=(sum*1.0)/count;
		System.out.println(Y);
		
		
	}

}
