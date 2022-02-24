package arrays;

import java.util.Scanner;

public class p141 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int A[]=new int[n];
		for (int x=0;x<n;x++)
			A[x]=input.nextInt();
		for (int x=0;x<n;x++)
		{
			int k=0;
			for (int y=1;y<=A[x];y++)
				if  (A[x]%y==0)
				   k++;
			if ( k!=2)
				System.out.print(A[x]);
			
		}

	}

}
