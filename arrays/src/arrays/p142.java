package arrays;

import java.util.Scanner;

public class p142 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int A[]=new int[n];
		for (int x=0;x<n;x++)
			A[x]=input.nextInt();
		System.out.println(" لطفا خانه مورد نظر خود را وارد کنید:");
		int k=input.nextInt();
		System.out.println(" لطفا مقدار مورد نظر خود را وارد کنید:");
		int m=input.nextInt();
		for (int x=0;x<n;x++)
		{
			if (x==k)
				A[x]=m;
		}
		for (int x=0;x<n;x++)
			System.out.print(A[x]);
		
		
		
	}

}
