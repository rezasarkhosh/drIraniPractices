package arrays;

import java.util.Scanner;

public class hobabi {

	public static void main(String[] args) {
	  Scanner input=new Scanner (System.in);
	  System.out.println("لطفا طول ارایه خود را وارد کنید:");
	  int n=input.nextInt();
	  int A[]=new int[n];
	  for(int x=0;x<n;x++)
	  {
		  System.out.println(" لطفا عدد " + x + " ام را وارد کنید: ");
		  A[x]=input.nextInt(); 
		  }
	  for (int p=1;p<=n-1;p++)
	  {
		  for (int y=0;y<n-p;y++)
			  if (A[y+1]<A[y])
			  {
				  int temp=A[y];
			     	 A[y]=A[y+1];
					A[y+1]=temp;	 
			  }
		 
	  }
	  for (int x=0;x<n;x++)
		  System.out.print(A[x] + " ");
	}

}
