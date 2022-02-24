package arrays;

import java.util.Scanner;

public class p135 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int A[]=new int[n];
		int temp;
		System.out.println(" لطفا تعداد خانه های شیفت را وارد کنید:");
		int m=input.nextInt();
		for (int x=0;x<n;x++)
		{
		 	System.out.println(" لطفا عدد" + x + "را وارد کنید");
		   A[x]=input.nextInt();
		}
		for (int y=0;y<m;y++)
		{
			temp = A[n-1];
			for (int x=n-1;x>0;x--)
			  A[x]=A[x-1];	
			
			  A[0]=temp;
			
	}
		for(int x=0;x<n;x++)
	System.out.print(A[x]);	

	}

}
