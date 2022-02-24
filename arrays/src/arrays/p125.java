package arrays;

import java.util.Scanner;

public class p125 {

	public static void main(String[] args) {

			Scanner input=new Scanner(System.in);
			   int n=20;
			   int A[]=new int[n];
			   for (int x=0;x<n;x++)
				   A[x]=input.nextInt();
	           
			   int s=0;
			   for(int x=0;x<n;x++) // پیدا کردن میانگین
			   {
				   s=A[x]+s;
				   }
			int T=s/n;
			   System.out.print("A[");
			   for(int x=0;x<n;x++) // بررسی اول بودن
			   {
				int p=0;
				   for(int y=1;y<=A[x];y++)
				   {
				    if (A[x]%y==0)
				    	p++;
				   }
				    if (p==2 && A[x]>T)
				    	System.out.print(A[x]);
				   
			   }
	            System.out.print("]");
	}

}
