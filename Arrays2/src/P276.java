import java.util.Scanner;

public class P276 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("لطفا تعداد سطر های ماتریس را وارد کنید:");
		int m=input.nextInt();
		System.out.println("لطفا تعداد  ستون های ماتریس را وارد کنید:");
		int n=input.nextInt();
		int A[][]=new int[m][n];
		for (int x=0;x<m;x++)
			for (int y=0;y<n;y++)
				A[x][y]=input.nextInt();
		System.out.println("لطفا عددی را که می خواهید به ارایه های ماتریس ضرب شود را وارد کنید:");
		int p=input.nextInt();
		
		
		for (int x=0;x<m;x++)
			for (int y=0;y<n;y++)
				A[x][y]=A[x][y]*p;
		
		for (int x=0;x<m;x++)
		{
			for (int y=0;y<n;y++)
				System.out.print(A[x][y]+ " ");
		System.out.println();
		}
	}

}
