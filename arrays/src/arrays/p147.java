package arrays;

import java.util.Scanner;

public class p147 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println(" لطفا طول ارایه اول خود را وارد کنید:");
		int n=input.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		int cB=0;
		for (int x=0;x<n;x++)
		{
			System.out.println(" ENTER A["+ x + "]:");
			A[x]=input.nextInt();
		}
		for (int x=0;x<n;x++)
		{
			int k=0;
			for (int y=x;y<n;y++) 
				if (A[x]==A[y])
					k++;
			B[cB++]=k;
       
		}
		 for (int x=0;x<cB;x++)
                 System.out.print(B[x]);
	}

}
