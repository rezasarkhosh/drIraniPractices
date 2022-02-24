import java.util.Scanner;

public class P272 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("لطفا تعداد سطر های ماتریس را وارد کنید:");
		int m=input.nextInt();
		System.out.println("لطفا تعداد  ستون های ماتریس را وارد کنید:");
		int n=input.nextInt();
		int A[][]=new int [m][n];
		
		for (int x=0;x<m;x++)
			for (int y=0;y<n;y++)
				A[x][y]=(int)(Math.random()*9+1);
		for (int x=0;x<m;x++)
		{
			for (int y=0;y<n;y++)
				System.out.print(A[x][y]+ " ");
		System.out.println();
		}
		System.out.println();
		System.out.println();
		 int p;
		 int temp;
		for (int x=0;x<m;x++)
		{	
			for (int z=0;z<=2;z++)
			 {
				p=z;
				for (int y=z+1;y<=3;y++)
		        	if (A[x][y]<A[x][z])
		                	p=y;	
			
					temp=A[x][z];
					A[x][z]=A[x][p];
					A[x][p]=temp;
			
             }
		}
	
		for (int x=0;x<m;x++)
		{
			for (int y=0;y<n;y++)
				System.out.print(A[x][y]+ " ");
		System.out.println();
		}
		
	}

}
