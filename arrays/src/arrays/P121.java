package arrays;

import java.util.Scanner;

public class P121 {

	public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
     int n=input.nextInt();
     int A[]=new int[n];
      for ( int x=0;x<n;x++)
    	 A[x]=input.nextInt();
    System.out.print("A[" );
     for (int x=n-1;x>=0;x--)
    	 System.out.print(A[x]);
     System.out.println("]");
     
     
     
     
     
     
     
     
	}

}
