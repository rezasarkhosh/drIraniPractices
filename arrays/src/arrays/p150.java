package arrays;

import java.util.Scanner;

public class p150 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" لطفا طول ارایه اول خود را وارد کنید:");
		int n = input.nextInt();
		int A[] = new int[n];
		int B[]=new int [n+100];
		int cB=10;
		
		for (int x = 0; x < n; x++) {
			System.out.println(" ENTER A[" + x + "]:");
			A[x] = input.nextInt();
		}
		/*
		for (int x = 0; x < n; x++) {
			for (int y = x + 1; y < n; y++)
				if (A[y] == A[x]) {
					for (int z = y; z < cA; z++)
					{
						A[z] = A[z + 1];
				     	cA--; 
				     	}
				}
*/
		for (int x = 0; x < n; x++) {
			int flag=0;
			for (int y = x + 1; y < n; y++)
				if (A[x]==A[y])
				{
					flag=1;
					break;
				}
                   if (flag==0)
                	   B[cB++]=A[x]; 
		}
		for (int x=0;x<cB;x++)
			System.out.print(B[x]);
		
	
	}

}
