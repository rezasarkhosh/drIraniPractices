package arrays;

import java.util.Scanner;

public class p146 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println(" لطفا طول ارایه اول خود را وارد کنید:");
		int n=input.nextInt();
		System.out.println(" لطفا عدد مور نظر  خود را وارد  کنید:");
		int m=input.nextInt();
		
		int A[]=new int[n];
		for (int x=0;x<n;x++)
		{
			System.out.println(" ENTER A["+ x + "]:");
			A[x]=input.nextInt();
		}
		int count=0;
		for (int x=0;x<n;x++)
		{
			if (A[x]==m)
				count++;	
		}
		System.out.println(count);
		
	}

}
