package arrays;

import java.util.Scanner;

public class p152 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println(" لطفا طول ارایه اول خود را وارد کنید:");
		int n=input.nextInt();
		long A[]=new long[n];
		for (int x=0;x<n;x++)
		{
			A[x]=(int) (Math.random()*90+10);
		}
		for(int x=0;x<n;x++)
			System.out.println("A["+x+"]: "+ A[x]);

	}

}
