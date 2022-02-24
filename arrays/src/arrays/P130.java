package arrays;

import java.util.Scanner;

public class P130 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		long n=input.nextLong();
	
		int A[]=new int[1000];
		 int cA=0;
		 while(n>0)
		 {
			 A[cA++]=(int) (n%2);
			 n=n/2;
		 }
      for (int x=cA-1;x>=0;x--)
    	  System.out.print(A[x]);
		

	}

}
