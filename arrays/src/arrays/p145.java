package arrays;

import java.util.Scanner;

public class p145 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println(" لطفا طول ارایه اول خود را وارد کنید:");
		int n=input.nextInt();
		System.out.println(" لطفا طول ارایه دوم خود را وارد  کنید:");
		int m=input.nextInt();
		
		int A[]=new int[n];
		int B[]=new int[m];
		 
		for (int x=0;x<n;x++)
		{
			System.out.println(" ENTER A["+ x + "]:");
			A[x]=input.nextInt();
		}
			
		for (int x=0;x<m;x++)
		{
		System.out.println(" ENTER B["+ x + "]:");
		B[x]=input.nextInt();
		}
		
              
		for (int x=0;x<n;x++)
			for (int y=0;y<m;y++)
	                 if(A[x]==B[y])
	                	 System.out.println(A[x]);
		
	}

}
