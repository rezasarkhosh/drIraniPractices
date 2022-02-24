package arrays;

import java.util.Scanner;

public class P144 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int A[]=new int[n*2];
		int cA=n*2;
		for (int x=0;x<n*2;x++)
		{
			if(x%2==0)
			{ 
				System.out.println(" PLEASE ENTER A[" + x + "]:");
				A[x]=input.nextInt();
			}
			if (x%2==0)
			{
				int temp=A[x];
				int k=0;
				while (temp>0)
				{
					k++;
					temp=temp/10;
				}
				A[x+1]=k;	
			}
			}
		System.out.print("{");
		for (int x=0;x<cA;x++) {
                 if(x==cA-1)
                	 System.out.print(A[x]+ "}");
					 if (x!=cA-1)
						 System.out.print(A[x]+ ",");
	}

	}
}
