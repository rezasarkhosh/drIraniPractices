package arrays;

import java.util.Scanner;

public class p131 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int A[]=new int[n];
		for (int x=0;x<n;x++)
			A[x]=input.nextInt();
		System.out.println(" لطفا خانه مورد نظر خوئد را که میخواهید حذف کتید را وارد  کنید");
		int m=input.nextInt();
		
		
		for (int x=m;x<n-1;x++)
		{
			A[x]=A[x+1];
			
			
		}
		for (int x=0;x<n-1;x++)
			System.out.print(A[x]);

	}

}
