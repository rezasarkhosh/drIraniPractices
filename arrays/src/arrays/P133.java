package arrays;

import java.util.Scanner;

public class P133 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in );
        int n=input.nextInt();
        int A[]=new int[n];
        int cB=0;
        int B[]=new int[cB];
        int cC=0;
        int C[]=new int[cC];
        for (int x=0;x<n;x++)
        {
        	System.out.println(" لطفا عدد" + x + "را وارد کنید");
        	A[x]=input.nextInt();
        }
        	System.out.println(" لطفا خانه اول را وارد کنید");
        	int m1=input.nextInt();
        	System.out.println(" لطفا خانه  دوم را وارد کنید");
        	int m2=input.nextInt();
		
        	for (int x=0;x<m1;x++)
        		B[cB++]=A[x];
        	for (int x=m2+1;x<n;x++)
        		C[cC++]=A[x];
        	
        	for (int x=0;x<cB;x++)
        		System.out.print(B[x]);
        	for (int x=0;x<cC;x++)
        		System.out.print(C[x]);	
	}

}
