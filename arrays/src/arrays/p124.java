package arrays;

import java.util.Scanner;

public class p124 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		   int n=input.nextInt();
		   int A[]=new int[n];
		   for (int x=0;x<n;x++)
			   A[x]=input.nextInt();
            int p=0;
		   int s=0;
		   for(int x=0;x<n;x++) {
			   s=A[x]+s;
			   }
		int T=s/n;
		   
		   for(int x=0;x<n;x++)
			   if(A[x]>T)
				  p++;
		 
		System.out.println(p);
		
		
	}

}
