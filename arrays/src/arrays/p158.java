package arrays;

import java.util.Scanner;

public class p158 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in); 
		int n=input.nextInt();
		 int A[]=new int[n+1];
		 A[0]=1;
		 int cA=1;
		 for (int x=0;x<=n;x++)
		 {
			 A[cA]=1;
			 cA++;
			 for (int y=cA-2;y>=1;y++)
                        A[x]=A[x]+A[x-1];
	 }
for (int x=0;x<n;x++)
	System.out.print(A[x] + " ");
	}

}
