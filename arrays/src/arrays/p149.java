package arrays;

import java.util.Scanner;

public class p149 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println(" لطفا طول ارایه اول خود را وارد کنید:");
		int n=input.nextInt();
		int A[]=new int[n];
		for (int x=0;x<n;x++)
		{
			System.out.println(" ENTER A["+ x + "]:");
			A[x]=input.nextInt();
		}
		int max=0;
		int c=0;
		for (int x=0;x<n;x++)
		{
			int k=0;
			for (int y=0;y<n;y++)
				if (A[x]==A[y])
					k++;
			if (k>max)
			{
				max=k;
			c=x;
			}
		}
		for (int x=0;x<n;x++)
		System.out.print(c);

	}

}
