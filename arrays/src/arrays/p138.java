package arrays;

import java.util.Scanner;

public class p138 {

	public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
     int n=input.nextInt();
     int A[]=new int[n];
     int cB=0;
     int B[]=new int[n];
     int cC=0;
     int C[]=new int[n];
     
     for ( int x=0;x<n;x++)
    	 A[x]=input.nextInt();
     for (int x=0;x<n;x++)
     {
    	 int c=0;
    	 for (int y=1;y<=A[x];y++)
    	 {
    		       if (A[x]%y==0)
    		    	c++; 
    	 }
    		    if (c==2)
    		    	B[cB++]=A[x];
    		    else 
    		    	   	 C[cC++]=A[x];
    	 }
    	for (int x=0;x<cB;x++)
    		System.out.print(B[x]);
    	System.out.println();
    	for (int x=0;x<cC;x++)
    		System.out.print(C[x]);
     }
     }