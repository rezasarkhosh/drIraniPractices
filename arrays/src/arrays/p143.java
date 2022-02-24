package arrays;

import java.util.Scanner;

public class p143 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
/*
		int n = input.nextInt();
		int A[] = new int[n * 2];
		for (int x = 0; x < n * 2; x++)
		{
			A[x] = input.nextInt();
			for (int x = 0; x < n; x++) 
			{
				int k = 0;
				for (int y = 1; y <= A[x]; y++)
					if (A[x] % y == 0)
						k++;
				for (int z = n - 1; z > x; z--)
					A[z + 1] = A[z];
				A[x + 1] = k;
			} // end of for 2
		} // end of for 1
		for (int x = 0; x < n; x++)
			System.out.print(A[x] + " ");
*/
	
		int n = input.nextInt();
		int A[] = new int[n*2];
		int cA=n*2;
		for (int x = 0; x < n*2; x++)
		{
			if (x%2==0)
			{
				System.out.println(" PLEASE ENTER A[" + x + "]:");
				A[x]=input.nextInt();
			}
			
			
				if (x%2==0)
				{
					int k=0;
					for (int y=1;y<=A[x];y++)
						if (A[x]%y==0)
							k++;
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

