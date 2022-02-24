package arrays;

import java.util.Scanner;

public class p139 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int A[] = new int[n];
		int cB = 0;
		int B[] = new int[n];
		int cC = 0;
		int C[] = new int[n];
		int cD = 0;
		int D[] = new int[n];

		/////////////////////// گرفتن ارایه A
		for (int x = 0; x < n; x++)
			A[x] = input.nextInt();

		/////////////////////// بررسی مرکب بودن
		for (int x = 0; x < n; x++) {
			int s = 0;
			for (int y = 1; y <= A[x] / 2; y++)
				
				if (A[x]%y==0)
					s = s + y;
			if (s == A[x])
				B[cB++] = A[x];
			/////////////////////// بررسی اول بودن

			int c=0;
			for (int y=1;y<=A[x];y++)
				if (A[x]%y==0)
			       c++;
			if (c==2)
				C[cC++]=A[x];
			///////////////////////  بررسی فیبوناچی
			int a=0;
		    int b=1;
			int d=0;
			while (d<A[x]) {
				d=a+b;
				a=b;
				b=d;
			}
				if (d==A[x])
					D[cD++]=A[x];
				
				
			}
		for (int x=0;x<cB;x++)
			System.out.print(B[x]);
		System.out.println();
		for (int x=0;x<cC;x++)
			System.out.print(C[x]);
		System.out.println();
		for (int x=0;x<cD;x++)
			System.out.print(D[x]);
			
		}
	}


