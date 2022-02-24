package arrays;

import java.util.Scanner;

public class P136 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
      int n=input.nextInt();
      int A[]=new int[n];
      for (int x=0;x<n;x++)
    	  A[x]=input.nextInt();
      for (int x=0;x<n/2;x++)
      {
    	         int temp=A[x];
    			  A[x]=A[n-x-1];
    	           A[n-x-1]=temp;
      }  
      for (int x=0;x<n;x++)
    	  System.out.println(A[x]);
      }
	}


