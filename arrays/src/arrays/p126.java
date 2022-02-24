package arrays;

import java.util.Scanner;

public class p126 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
     	int n=input.nextInt();	
        int A[]=new int[n];
        for(int x=0;x<n;x++)
        	A[x]=input.nextInt();
        int s=0;	
        for (int x=0;x<n;x++)
        s=A[x]+s;
        int T=s/n;
        for (int x=0;x<n;x++) 
        {
        	int a=0;
            int b=1;
            int c=0;
         while (c<A[x])
         {
        	 c=a+b;
        	 a=b;
        	 b=c;
         }
        	 if (A[x]==c && A[x]>T)
        	 System.out.println(A[x]);
        	 
         
        	
	}

}
}