import java.util.Scanner;

public class P254 {

	public static void main(String[] args) {
		 Scanner input=new Scanner (System.in);
		 int n=input.nextInt();
		 int m=input.nextInt();
		 int A[][]=new int [n][m];
		 for (int x=0;x<n;x++)
		  for (int y=0;y<m;y++)
			 A[x][y]=input.nextInt();		 
		 
		 
		 for (int x=0;x<n;x++)
		 { for (int y=0;y<m;y++)
			 {
				 if (x==y)
					 System.out.print(A[x][y] + " ");
				 else 
					 System.out.print(" ");
              }
		 System.out.println();
		 }

	}

}
