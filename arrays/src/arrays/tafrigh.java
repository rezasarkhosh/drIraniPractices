package arrays;

import java.util.Scanner;

public class tafrigh {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		  int n=input.nextInt();
		    int m=input.nextInt();
		    int A[]=new int[n+10];
		    int cA=n;
		    int B[]=new int[m+10];
		    int cB=m;
		    for(int x=cA-1;x>=0;x--)
		    	A[x]=input.nextInt();
		    for(int x=cB-1;x>=0;x--)
			    B[x]=input.nextInt();
		    if (cA>cB)
		    	for (int x=cB;x<cA;x++)
		    		B[x]=0;
		    if (cA<cB)
		    	for (int x=cA;x<cB;x++)
		    		A[x]=0;
		int max =0;
		if (cA>cB)
			max=cA;
		else 
			max =cB;
		int C[]=new int [max+10];
		int cC=0;
		int q=0;
		for (int x=0;x<max;x++)
		{
			C[x]=(A[x]+B[x]+q)%10;
			q=(A[x]+B[x]+q)/10;
		}
		cC=max;
		if (q>0)
		while(q>0)
		{
			C[cC++]=q%10;
			q=q/10;
		}
		for (int x=cC-1;x>=0;x--)
		System.out.print(C[x]);
	   	}

}
