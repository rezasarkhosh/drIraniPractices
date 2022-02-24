package arrays;

import java.util.Scanner;

public class p129 {

	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		System.out.println(" لطفا طول ارایه خود را وار کنید:");
		int n=input.nextInt();
		int A[]=new int[n];
		int p=0;
		for (int x=0;x<n;x++)
	{ 
			System.out.println(" لطفا ارایه " + x + "  ام را وارد کنید:");
			A[x]=input.nextInt();
	}
		System.out.println(" لطفا عددی که میخواهید تکرار آن محاسبه شود را وارد کنید:");
		int m=input.nextInt();
		
		for (int x=0;x<n;x++)
		{
			if(A[x]==m)
		      System.out.print(x);
		}
	
		
		
		
}
}