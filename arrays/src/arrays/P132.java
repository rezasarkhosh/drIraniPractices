package arrays;

import java.util.Scanner;

public class P132 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int A[]=new int[n];
		int cA=n;
		for (int x=0;x<n;x++)
			A[x]=input.nextInt();
		
		System.out.println(" لطفا عددی را که  میخواهید از کل ارایه حذف شود را وارد کنید");
		int m=input.nextInt();
		int iA=0;
		/*
		for( int x=0;x<n-p;x++)
		{
			   if (A[x]==m) {
			       p++;
				for (int y=x;y<n-1;y++)
					A[x]=A[x+1];
			
		     			}
			}
		 for (int z=0;z<n-p;z++)
	          System.out.print(A[z]);
*/
		while (iA<cA)
		{
			if (A[iA]==m)
			{
				for (int x=iA;x<=n-2;x++)
					A[x]=A[x+1];
							cA--;
			}
			else 
				iA++;
		}
		
		
		for (int x=0;x<cA;x++)
			System.out.print(A[x]);

	}

}
