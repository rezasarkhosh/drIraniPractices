package arrays;

import java.util.Scanner;

public class p123 {

	public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int n=input.nextInt();
   int A[]=new int[n];
   for (int x=0;x<n;x++)
	   A[x]=input.nextInt();

   int s=0;
   for(int x=0;x<n;x++) {
	   s=A[x]+s;
	     }
   int T=s/n;
   System.out.print("A[");
   for(int x=0;x<n;x++)
	   if(A[x]>T)
		   System.out.print(A[x]);
   System.out.println("]");
	  
      
   
   
   
   
	}

}
