package arrays;

import java.util.Scanner;

public class jam2addbozorg {

	public static void main(String[] args)
	{
	     Scanner input=new Scanner(System.in);
	    System.out.println("لطفا طول ارایه اول خود را وارد کنید:");
	     int n=input.nextInt();
	     System.out.println("لطفا طول ارایه دوم خود را وارد کنید:");
		int m=input.nextInt();
		int max=m;
		if(n>m)
			max=n;
		int A[]=new int[max];
		int cA=n;
		int B[]=new int[max];
		int cB=m;
		int C[]=new int[m+n];
		int cC=0;
		for (int x=0;x<=n-1;x++)
		{
			System.out.println("لطفا عدد " + x + " ام را وادر کنید");
			A[x]=input.nextInt();
		}
			
		for (int x=0;x<=m-1;x++)
		{
			System.out.println("لطفا عدد " + x + " ام را وادر کنید");
			B[x]=input.nextInt();
		}
		/*int max=cA;
		if(cA>cB){
			int o=cB;
			int v=cA-cB;
	    	   	 cB=cB+v; 
	      for (int x=cB-v;x<cB;x++) 
	      {
	    	  //B[x]=0;
	    	  max=cA;
	      }}
		
		 if(cB>cA)
		 {
			 int o=cA;
			 int z=cB-cA;
    	   	 cA=cA+z;
		  for (int x=o;x<cB;x++)
		  {
			  A[x]=0;
			  max=cB;
		  }
		 }*/

		 int q=0; // عدد نقلی 
		 for (int x=0;x<max;x++)
		 {
			 C[x]=(A[x]+B[x]+q)%10;
			 q=(A[x]+B[x]+q)/10;
		 }
		 cC=max;
		 while(q>0)
		 {
			 C[cC++]=q%10;
			 q=q/10;
					 }
    for (int x=cC-1;x>=0;x--)	
		System.out.print(C[x]);
	}

}
